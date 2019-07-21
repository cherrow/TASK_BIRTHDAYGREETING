package com.cherrow.task;

import com.cherrow.task.greeting.BirthdayGreeting;

public class Application {

    public static void main(String[] args){
        long successCount = BirthdayGreeting.sendGreetingReturnSuccessCount();
        System.out.println("共成功发送" + successCount + "条邮件");
    }

}
