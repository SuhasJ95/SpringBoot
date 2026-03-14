package com.example.collegeProject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegeProject.dto.request.StudentRequest;
import com.example.collegeProject.dto.response.ApiResponse;
import com.example.collegeProject.dto.response.StudentResponse;
import com.example.collegeProject.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    
@PostMapping("/{lecturerId}/studentsresult")
public ApiResponse<StudentResponse> createStudent(
        @PathVariable Long lecturerId,
        @RequestBody StudentRequest req){

    StudentResponse result = service.getResults(lecturerId, req);

    return new ApiResponse<>("success", result);
}
    
}
