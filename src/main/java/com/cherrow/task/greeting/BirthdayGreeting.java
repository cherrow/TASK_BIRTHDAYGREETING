package com.cherrow.task.greeting;

import com.cherrow.task.model.Employee;
import com.cherrow.task.model.Message;
import com.cherrow.task.utils.EmailService;
import com.cherrow.task.utils.FileUtil;

public class BirthdayGreeting {

    public static long sendGreetingReturnSuccessCount() {
        return FileUtil.convertFileToEmployee().stream()
                .filter(Employee::todayIsBirthday)
                .filter(employee -> EmailService.send(employee.getEmailAddress(),
                        Message.builder()
                                .subject("Happy birthday!")
                                .content("Happy birthday, dear " + employee.getFirstName())
                                .build()))
                .count();
    }
}
