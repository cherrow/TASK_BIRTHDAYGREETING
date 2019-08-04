package com.cherrow.task.config;

public final class TaskConfiguration {

    private TaskConfiguration() {

    }

    private static String filePath =  System.getProperty("user.dir") + "\\employee_records.txt";

    public static String getFilePath() {
        return filePath;
    }

    public static void setFilePath(final String path) {
        filePath = path;
    }
}
