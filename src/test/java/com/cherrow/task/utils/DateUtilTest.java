package com.cherrow.task.utils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertTrue;

public class DateUtilTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_throw_exception_giving_invalid_string() {
        String invalidDate = "1956///12/26";

        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("日期转换出错, date:" + invalidDate);

        DateUtil.isSameMonthDayWithNow(invalidDate);
    }

    @Test
    public void should_return_true_giving_today() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String today = LocalDateTime.now().format(formatter);
        assertTrue(DateUtil.isSameMonthDayWithNow(today));
    }
}