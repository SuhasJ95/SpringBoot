package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TaskRequest {

    @NotBlank(message = "Title can not empty")
    private String title;

    private String description;

    @Positive(message = "Priority should be positive")
    private Integer priority;
    
}
