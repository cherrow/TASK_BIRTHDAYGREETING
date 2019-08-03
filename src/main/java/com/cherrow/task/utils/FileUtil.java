package com.cherrow.task.utils;

import com.cherrow.task.config.TaskConfiguration;
import com.cherrow.task.model.Employee;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FileUtil {

    private static final int MIN_LINE_COUNT = 2;

    public static List<Employee> convertFileToEmployee(){
        //读取文件
        List<String[]> lineLists;
        try {
            lineLists = Files.lines(Paths.get(TaskConfiguration.FILE_PATH), Charset.defaultCharset())
                    .map(line->line.split(","))
                    .collect(toList());
        } catch (IOException e) {
            throw new RuntimeException("文件读取出错", e);
        }

        if(lineLists.size() < MIN_LINE_COUNT){
            return Collections.emptyList();
        }

        //去除列名
        lineLists.remove(0);
        return lineLists.stream()
                .map(line->new Employee(line[0],line[1], line[2],line[3]))
                .collect(toList());
    }
}
