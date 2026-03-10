package com.example.demo.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TaskRequest;
import com.example.demo.dto.TaskResponse;
import com.example.demo.entity.TaskEntity;
import com.example.demo.response.ApiResponse;
import com.example.demo.service.TaskService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tasks")
public class TaskController {
     public final TaskService taskService;

     public TaskController(TaskService taskService) {
        this.taskService = taskService;
     }


     @PostMapping("/bulk")
     public ApiResponse<List<TaskResponse>> createTasks (@Valid @RequestBody List<TaskRequest> taskRequests){
         List<TaskResponse> responses = taskService.createTasks(taskRequests);
         return new ApiResponse<List<TaskResponse>>("success", responses);
     }

     @GetMapping
     public ApiResponse<Page<TaskEntity>> getTasks(Pageable pageable){
       Page<TaskEntity> response = taskService.getTasks(pageable);
       return new ApiResponse<Page<TaskEntity>>("success", response);
     }
     


    
}