package com.cherrow.task.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHandler {

    public static Date formatStringToDate(String birthdate){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        try{
            return formatter.parse(birthdate);
        }catch (ParseException e){
            throw new RuntimeException("日期转换出错");
        }
    }

    public static boolean isSameMonthDateWithNow(Date date){
        Calendar dateCal = Calendar.getInstance();
        dateCal.setTime(date);

        Calendar nowCal = Calendar.getInstance();
        nowCal.setTime(new Date());

        boolean isSameMonth = dateCal.get(Calendar.MONTH) == nowCal.get(Calendar.MONTH);
        boolean isSameDate =  dateCal.get(Calendar.DAY_OF_MONTH) == nowCal.get(Calendar.DAY_OF_MONTH);

        return isSameMonth && isSameDate;
    }

}
