package com.java.spring_donations.utils;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

// Xây dựng phương thức gửi email
public class MailUtil {
	
	// Phương thức gửi email: email, title, text.
    public static void sendMail(JavaMailSenderImpl emailSender,String email,String title,String text){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject(title);
        message.setText(text);
        
        emailSender.send(message);
    }
    
    // Xây dựng phương thức gửi email với HTML
    public static void sendHtmlMail(JavaMailSenderImpl emailSender,String email,String title,String html)throws MessagingException {
        MimeMessage message = emailSender.createMimeMessage();
        boolean multipart = true;
        MimeMessageHelper helper = new MimeMessageHelper(message, multipart, "utf-8");
        String htmlMsg = html;
        message.setContent(htmlMsg, "text/html");
        helper.setTo(email);
        helper.setSubject(title);

        emailSender.send(message);
    }
}
