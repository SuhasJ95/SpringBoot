package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.StudentRequest;
import com.example.demo.dto.response.StudentResponse;

@Service
public class StudentService {
    
    public StudentResponse calStudentResponse(StudentRequest req){
        int total=0;
        total =req.getMarks1()+req.getMarks2()+req.getMarks3()+req.getMarks4()+req.getMarks5();
        double percentage =total/5.0;
        String result=percentage >= 75 ? "PASS" : "FAIL";

        return new StudentResponse(req.getName(), req.getRollNumber(), total, percentage, result);
    }
}
