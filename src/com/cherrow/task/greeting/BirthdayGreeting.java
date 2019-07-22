package com.cherrow.task.greeting;

import com.cherrow.task.model.Employee;
import com.cherrow.task.utils.EmailHandler;
import com.cherrow.task.utils.FileHandler;

import java.util.List;
import java.util.stream.Collectors;

public class BirthdayGreeting {

    public static List<Employee> getIsBirthdayEmployee(){
        return FileHandler.convertFileToEmployee().stream()
                .filter(Employee::todayIsBirthday)
                .collect(Collectors.toList());
    }

    public static long sendGreetingReturnSuccessCount(){
       return getIsBirthdayEmployee().stream()
                .filter(EmailHandler::sendEmail)
                .count();
    }

}
