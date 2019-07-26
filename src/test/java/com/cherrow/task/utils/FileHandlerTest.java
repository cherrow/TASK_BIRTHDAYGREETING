package com.cherrow.task.utils;

import com.cherrow.task.config.TaskConfiguration;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Collections;

import static org.junit.Assert.*;

public class FileHandlerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_get_an_empty_list_giving_one_line_file() {
        TaskConfiguration.FILE_PATH = System.getProperty("user.dir") + "\\employee_records_one_line.txt";
        assertEquals(Collections.emptyList(),FileHandler.convertFileToEmployee());
    }

    @Test
    public void should_throw_exception_giving_invalid_filepath() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("文件读取出错");

        TaskConfiguration.FILE_PATH = "D:\\invalid\\path\\employee_records.txt";
        FileHandler.convertFileToEmployee();
    }
}