package com.example.baseBatch.config;

import com.example.baseBatch.domain.TargetAudience;
import org.springframework.batch.core.ItemReadListener;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class BaseConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private ItemReadListener<TargetAudience> readListener;
    @Autowired
    private ItemWriteListener<TargetAudience> writeListener;
    @Autowired
    private ItemProcessor<TargetAudience, TargetAudience> processor;

//    @Bean
//    public Step emailSenderStep() {
//        return stepBuilderFactory.get("TEST")
//                .<MemberEntity, MemberEntity>chunk(100)
//                .reader()
//    }
//
//    @Bean
//    public Job emailSenderJob() {
//        return jobBuilderFactory.get("SENDER_MAIL")
//                .start();
//    }
}
