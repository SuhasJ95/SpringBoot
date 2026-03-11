package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.StudentRequest;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.dto.response.StudentResponse;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/process")
    public ApiResponse<StudentResponse> calResult(@RequestBody StudentRequest request) {
        StudentResponse result = studentService.processStudent(request);
        return new ApiResponse<StudentResponse>("success", result);
        
    }

    @GetMapping("/all")
    public ApiResponse<List<StudentResponse>> getAllStudents() {
        List<StudentResponse> students = studentService.getAllStudents();
        return new ApiResponse<List<StudentResponse>>("success", students);
        
    } 
}
