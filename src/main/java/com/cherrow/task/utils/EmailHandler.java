package com.cherrow.task.utils;

import com.cherrow.task.model.Employee;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailHandler {

    public static boolean sendEmail(Employee receiver){
        String host = "smtp.qq.com";
        String from = "1312745053@qq.com";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.auth", "true");
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties,new Authenticator(){
            @Override
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(from, "khxmpfbyzmnnihhc"); //发件人邮件用户名、授权码
            }
        });
        //compose the message
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(receiver.getEmailAddress()));
            message.setSubject("Happy birthday!");
            message.setText("Happy birthday, dear " + receiver.getFirstName() +"!");

            // Send message
            Transport.send(message);
            return true;

        }catch (MessagingException mex) {
            mex.printStackTrace();
            return false;
        }
    }
}
