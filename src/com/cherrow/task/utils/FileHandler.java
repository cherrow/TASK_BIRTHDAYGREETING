package com.cherrow.task.utils;

import com.cherrow.task.model.Employee;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FileHandler {

    private static final int MIN_LINE_COUNT = 2;

    public static List<Employee> convertFileToEmployee(){
        String fileName = "C:\\Users\\Lenovo\\Desktop\\hello.txt";
        //读取文件
        List<String[]> lineLists;
        try {
            lineLists = Files.lines(Paths.get(fileName), Charset.defaultCharset())
                    .map(line->line.split(","))
                    .collect(toList());
        } catch (IOException e) {
            throw new RuntimeException("文件读取出错");
        }

        if(lineLists.size() < MIN_LINE_COUNT){
            return Collections.emptyList();
        }

        return lineLists.stream()
                .map(line->new Employee(line[0],line[1],DateHandler.formatStringToDate(line[2]),line[3]))
                .collect(toList());
    }
}
