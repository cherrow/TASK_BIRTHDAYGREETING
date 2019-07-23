package test.greeting;

import com.cherrow.task.greeting.BirthdayGreeting;
import com.cherrow.task.model.Employee;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class BirthdayGreetingTest {

    @Test
    public void should_get_expected_employees_giving_flat_file() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

        Employee john = new Employee("Doe", "John", formatter.parse("1982/07/23"), "cherrow@foxmail.com");
        Employee mary = new Employee("Ann", "Mary", formatter.parse("1975/07/23"), "mary.ann@foobar.com");

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(mary);

        assertEquals(employees, BirthdayGreeting.getIsBirthdayEmployee());
    }
}