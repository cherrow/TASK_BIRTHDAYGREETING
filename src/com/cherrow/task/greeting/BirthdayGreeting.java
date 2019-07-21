package com.cherrow.task.greeting;

import com.cherrow.task.model.Employee;
import com.cherrow.task.utils.EmailHandler;
import com.cherrow.task.utils.FileHandler;

public class BirthdayGreeting {

    public static long sendGreetingReturnSuccessCount(){
       return FileHandler.convertFileToEmployee().stream()
                .filter(Employee::todayIsBirthday)
                .filter(EmailHandler::sendEmail)
                .count();
    }

}
