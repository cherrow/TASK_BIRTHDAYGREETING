package com.cherrow.task.utils;

import com.cherrow.task.model.Message;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class EmailService {

    private EmailService() {

    }

    public static boolean send(String emailAddress, Message message) {
        log.info("sending message to " + emailAddress + "...");
        System.out.println(message.getSubject());
        System.out.println(message.getContent());
        log.info("sending email success");
        return true;
    }
}
