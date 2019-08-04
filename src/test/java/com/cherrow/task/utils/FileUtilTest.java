package com.cherrow.task.utils;

import com.cherrow.task.config.TaskConfiguration;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class FileUtilTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_get_an_empty_list_giving_one_line_file() {
        TaskConfiguration.setFilePath(System.getProperty("user.dir") + "\\employee_records_one_line.txt");
        assertEquals(Collections.emptyList(), FileUtil.convertFileToEmployee());
    }

    @Test
    public void should_throw_exception_giving_invalid_file_path() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("文件读取出错");

        TaskConfiguration.setFilePath("D:\\invalid\\path\\employee_records.txt");
        FileUtil.convertFileToEmployee();
    }
}