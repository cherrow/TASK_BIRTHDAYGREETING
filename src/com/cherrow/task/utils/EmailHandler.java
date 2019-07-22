package com.cherrow.task.utils;

import com.cherrow.task.model.Employee;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailHandler {

    public static boolean sendEmail(Employee receiver){
        String host = "localhost";
        String from = "cherrow@foxmail.com";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);

        //compose the message
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(receiver.getEmailAddress()));
            message.setSubject("Happy birthday!");
            message.setText("Happy birthday, dear" + receiver.getFirstName() +"!");

            // Send message
            Transport.send(message);
            return true;

        }catch (MessagingException mex) {
            mex.printStackTrace();
            return false;
        }
    }
}
