package test.utils;

import com.cherrow.task.utils.DateHandler;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Date;

import static org.junit.Assert.*;

public class DateHandlerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_throw_exception_giving_invalid_string() {
        String invalidDate = "1956///12/26";

        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("日期转换出错, date:"+ invalidDate);

        DateHandler.formatStringToDate(invalidDate);
    }

    @Test
    public void should_get_expected_string_giving_date() {
        assertEquals("2019/07/23", DateHandler.formatDateToString(new Date()));
    }

    @Test
    public void should_get_true_giving_today() {
        assertTrue(DateHandler.isSameMonthDateWithNow(new Date()));
    }
}