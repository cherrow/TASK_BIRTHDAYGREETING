package com.cherrow.task.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {

    private String subject;

    private String content;
}
