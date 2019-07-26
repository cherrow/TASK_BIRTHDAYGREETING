package com.cherrow.task.utils;

import com.cherrow.task.model.Employee;
import com.cherrow.task.utils.EmailHandler;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class EmailHandlerTest {

    @Test
    public void sholud_get_true_sending_email() throws ParseException{

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Employee john = new Employee("Doe", "John", formatter.parse("1982/07/23"), "cherrow@foxmail.com");

        assertTrue(EmailHandler.sendEmail(john));
    }
}