package com.cherrow.task;

import com.cherrow.task.config.TaskConfiguration;
import com.cherrow.task.greeting.BirthdayGreeting;

public class Application {

    public static void main(String[] args){
        TaskConfiguration.FILE_PATH = System.getProperty("user.dir") + "\\employee_records.txt";
        BirthdayGreeting.sendGreetingReturnSuccessCount();
    }
}
