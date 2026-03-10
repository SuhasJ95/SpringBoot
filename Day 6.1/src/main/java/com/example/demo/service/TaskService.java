package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.TaskRequest;
import com.example.demo.dto.TaskResponse;
import com.example.demo.entity.TaskEntity;
import com.example.demo.repository.TaskRepository;

import lombok.Data;

@Data
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public List<TaskResponse> createTasks(List<TaskRequest> Requests) {
        List<TaskEntity> tasks= Requests.stream()
                .map(request -> {
                    TaskEntity task = new TaskEntity();
                    task.setTitle(request.getTitle());
                    task.setDescription(request.getDescription());
                    task.setPriority(request.getPriority());
                    return task;
                })
                .collect(Collectors.toList());

        List<TaskEntity> savedTasks = taskRepository.saveAll(tasks);

        return savedTasks.stream()
                .map(task -> {
                    TaskResponse response = new TaskResponse();
                    response.setId(task.getId());
                    response.setTitle(task.getTitle());
                    response.setDescription(task.getDescription());
                    response.setPriority(task.getPriority());
                    return response;
                })
                .collect(Collectors.toList());
       
    }

    public Page<TaskEntity> getTasks(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }


}
