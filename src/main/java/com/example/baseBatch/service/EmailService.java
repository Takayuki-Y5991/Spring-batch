package com.example.baseBatch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    @Value("${api.mail.from}")
    private String from;

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String to, String subject, String text) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(from);
        mail.setTo(to);
        mail.setSubject(subject);
        mail.setText(text);

        javaMailSender.send(mail);
    }
}
