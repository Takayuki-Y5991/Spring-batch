package com.example.baseBatch.config.tasklet;

import com.example.baseBatch.client.entity.custom.MailInformation;
import com.example.baseBatch.client.entity.custom.TargetAudience;
import com.example.baseBatch.client.inMemory.SendMailRedisClient;
import com.example.baseBatch.client.mybatis.custom.CustomEntityMapper;
import com.example.baseBatch.common.Constance;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.example.baseBatch.client.mybatis.BookEntityDynamicSqlSupport.bookEntity;
import static com.example.baseBatch.client.mybatis.BookRentalEntityDynamicSqlSupport.bookRentalEntity;
import static com.example.baseBatch.client.mybatis.BookReturnEntityDynamicSqlSupport.bookReturnEntity;
import static com.example.baseBatch.client.mybatis.MemberEntityDynamicSqlSupport.memberEntity;
import static org.mybatis.dynamic.sql.SqlBuilder.equalTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isGreaterThan;
import static org.mybatis.dynamic.sql.SqlBuilder.isNull;
import static org.mybatis.dynamic.sql.SqlBuilder.select;
import static org.mybatis.dynamic.sql.render.RenderingStrategies.MYBATIS3;

@Component
public class BookReturnReadTasklet implements Tasklet {

    @Autowired
    private CustomEntityMapper mybatis;

    @Autowired
    private SendMailRedisClient redisClient;

    @Value("${redis.key}")
    private String key;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

        // Publish SQL
        var options = select(bookEntity.title, memberEntity.memberId, memberEntity.name, memberEntity.email, bookRentalEntity.returnDate)
                .from(bookRentalEntity)
                .join(bookEntity).on(bookRentalEntity.bookId, equalTo(bookEntity.bookId))
                .join(memberEntity).on(bookRentalEntity.memberId, equalTo(memberEntity.memberId))
                .leftJoin(bookReturnEntity).on(bookReturnEntity.bookRentalId, equalTo(bookRentalEntity.bookRentalId))
                .where(bookEntity.status, isEqualTo(2))
                .and(bookReturnEntity.bookReturnId, isNull())
                .and(bookReturnEntity.returnDate, isGreaterThan(LocalDateTime.now().minusDays(Constance.MAIL_SEND_TRIGGER_BEFORE_DATE)))
                .orderBy(memberEntity.memberId)
                .build()
                .render(MYBATIS3);
        var rows = mybatis.selectAudience(options);
        // Combine data and Store data in redis, because share it next step
        storeFetchData.accept(combineToMailInformation.apply(rows));
        return RepeatStatus.FINISHED;
    }

    private final Function<List<TargetAudience>, List<MailInformation>> combineToMailInformation = (rows) -> {
        return rows.stream()
                .collect(Collectors.groupingBy(TargetAudience::getMemberId))
                .values()
                .stream()
                .map(targetAudiences -> {
                    return MailInformation.builder()
                            .email(String.valueOf(targetAudiences.get(0).getEmail()))
                            .memberName(targetAudiences.get(0).getName())
                            .returnDate(targetAudiences.get(0).getReturnDate())
                            .books(targetAudiences.stream().map(TargetAudience::getTitle).collect(Collectors.toList()))
                            .build();
                }).toList();
    };
    private final Consumer<List<MailInformation>> storeFetchData = (rows) -> redisClient.createBucket(key, rows);
}
