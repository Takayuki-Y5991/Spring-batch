package com.example.baseBatch.config;

import com.example.baseBatch.client.entity.custom.MailInformation;
import com.example.baseBatch.config.chunks.reader.SendMailReader;
import com.example.baseBatch.config.chunks.writer.SendMailWriter;
import com.example.baseBatch.config.tasklet.BookReturnReadTasklet;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class BaseConfig {

    // Need Create Job
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    // Need Create Step
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private SendMailReader reader;

    @Autowired
    private SendMailWriter writer;

    // Fetch data tasklet .
    @Autowired
    private BookReturnReadTasklet tasklet;

    // Data fetch step.
    @Bean
    public Step fetchData() {
        return stepBuilderFactory.get("fetchData")
                .tasklet(tasklet)
                .build();
    }

    @Bean
    public Step emailSenderStep() {
        return stepBuilderFactory.get("emailSenderStep")
                .<MailInformation, MailInformation>chunk(1)
                .reader(reader)
                .writer(writer)
                .build();
    }

    @Bean
    public Job emailSenderJob() {
        return jobBuilderFactory.get("SENDER_MAIL")
                .flow(fetchData())
                .next(emailSenderStep())
                .end()
                .build();
    }

    /* MysqlCursorItem Example */
//    // Phase Reader, Fetch member who Borrowing an expired books
//    public MyBatisCursorItemReader<TargetAudience> read(SqlSessionFactory sqlSessionFactory) {
//        SelectStatementProvider selectStatementProvider
//                = SpringBatchUtility.selectForCursor(bookEntity.title, memberEntity.memberId, memberEntity.name, memberEntity.email, bookRentalEntity.returnDate)
//                .from(bookRentalEntity)
//                .join(bookEntity).on(bookRentalEntity.bookId, equalTo(bookEntity.bookId))
//                .join(memberEntity).on(bookRentalEntity.memberId, equalTo(memberEntity.memberId))
//                .leftJoin(bookReturnEntity).on(bookReturnEntity.bookRentalId, equalTo(bookRentalEntity.bookRentalId))
//                .where(bookEntity.status, isEqualTo(2))
//                .and(bookReturnEntity.bookReturnId, isNull())
//                .and(bookReturnEntity.returnDate, isGreaterThan(LocalDateTime.now().minusDays(Constance.MAIL_SEND_TRIGGER_BEFORE_DATE)))
//                .build()
//                .render();
//        return new MyBatisCursorItemReaderBuilder<TargetAudience>()
//                .queryId(CustomEntityMapper.class.getName() + ".selectAudience")
//                .sqlSessionFactory(sqlSessionFactory)
//                .parameterValues(SpringBatchUtility.toParameterValues(selectStatementProvider))
//                .build();
//    }
}
