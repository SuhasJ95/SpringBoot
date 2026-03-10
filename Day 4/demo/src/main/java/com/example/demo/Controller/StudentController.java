package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.RegisterRequest;
import com.example.demo.dto.request.StudentRequest;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.dto.response.StudentResponse;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    
private final StudentService studentService;

public StudentController(StudentService studentService) {
    this.studentService = studentService;
}

@PostMapping("/register")
public ApiResponse<StudentResponse> registerStudent(@RequestBody StudentRequest studentRequest) {
    StudentResponse studentResponse = studentService.getStudentResponse(studentRequest);
    return new ApiResponse<>("success", studentResponse);

}

@PostMapping("/{id}/registers")
public ApiResponse<StudentResponse> assignRegistrationNumber(
    @PathVariable Long id,
    @RequestBody RegisterRequest registerRequest
) {
    StudentResponse studentResponse = studentService.assignRegistration(id, registerRequest.getRegNumber());
    return new ApiResponse<>("success", studentResponse);
}
}
