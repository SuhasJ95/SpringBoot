package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/average")
    public double calculateAverage(@RequestBody StudentMarks marks) {

        int total = marks.getS1() + marks.getS2() + marks.getS3() + marks.getS4() + marks.getS5();
        
        return  total / 5.0;
    }
}