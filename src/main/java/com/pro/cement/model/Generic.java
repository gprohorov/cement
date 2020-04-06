package com.pro.cement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Generic {
    @Id
    String id;
    String name;
    String desc;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;
}
