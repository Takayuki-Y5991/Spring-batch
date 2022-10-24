package com.example.baseBatch.processor;

import com.example.baseBatch.domain.TargetAudience;
import com.example.baseBatch.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@StepScope
@Component("SendEmail")
public class EmailProcessor implements ItemProcessor<TargetAudience, TargetAudience> {
    // TODO: Send email for each user
    @Autowired
    private EmailService service;

    @Override
    public TargetAudience process(TargetAudience item) throws Exception {
        try {
            service.sendEmail(item.getEmail(), "TEST", "TEST");
        } catch (Exception e) {
            log.debug("Mail Send Failed: {}", e.getMessage());
        }
        return item;
    }
}
