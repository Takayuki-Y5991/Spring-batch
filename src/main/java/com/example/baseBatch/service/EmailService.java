package com.example.baseBatch.service;

import com.example.baseBatch.client.entity.custom.MailInformation;
import com.example.baseBatch.common.Constance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private TemplateEngine templateEngine;

    public void sendEmail(MailInformation mailInformation) throws MessagingException {
        Context context = new Context();
        context.setVariable("mail", mailInformation);
        String process = templateEngine.process("email", context);
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        helper.setSubject(Constance.MAIL_SUBJECT);
        helper.setText(process, true);
        helper.setTo(mailInformation.getEmail());
        javaMailSender.send(mimeMessage);
    }
}
