package com.cherrow.task.utils;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtil {

    public static boolean isSameMonthDayWithNow(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        try {
            LocalDate birthDay = LocalDate.parse(date, formatter);
            LocalDate today = LocalDate.now();
            MonthDay birthMonthDay = MonthDay.from(birthDay);
            MonthDay currentMonthDay = MonthDay.from(today);
            return birthMonthDay.equals(currentMonthDay);
        }catch (DateTimeParseException e){
            throw new RuntimeException("日期转换出错, date:"+ date , e);
        }
    }
}
