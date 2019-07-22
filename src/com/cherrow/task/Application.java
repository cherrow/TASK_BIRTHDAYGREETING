package com.cherrow.task;

import com.cherrow.task.config.TaskConfiguration;
import com.cherrow.task.greeting.BirthdayGreeting;
import com.cherrow.task.model.Employee;

import java.util.List;

public class Application {

    public static void main(String[] args){
        TaskConfiguration.FILE_PATH = "E:\\work\\JAVA\\IdeaProjects\\employee_records.txt";

        List<Employee> birthdayEmployee = BirthdayGreeting.getIsBirthdayEmployee();
        System.out.println("共有 " + birthdayEmployee.size() + " 人今天生日：");
        birthdayEmployee.forEach(employee ->System.out.println(employee.toString()));

        long successCount = BirthdayGreeting.sendGreetingReturnSuccessCount();
        System.out.println("共成功发送" + successCount + "条邮件");
    }

}
