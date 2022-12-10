package com.example.baseBatch.config.chunks.writer;

import com.example.baseBatch.client.entity.custom.MailInformation;
import com.example.baseBatch.client.inMemory.SendMailRedisClient;
import com.example.baseBatch.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import java.util.List;

@Slf4j
@StepScope
@Component
public class SendMailWriter implements ItemWriter<MailInformation> {

    @Autowired
    private EmailService service;

    @Autowired
    private SendMailRedisClient client;

    @Value("${redis.key}")
    private String key;

    @Override
    public void write(List<? extends MailInformation> items) throws Exception {
        items.forEach(e -> {
            try {
                service.sendEmail(e);
            } catch (MessagingException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
