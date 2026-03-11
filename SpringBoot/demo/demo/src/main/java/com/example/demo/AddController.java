package com.example.demo;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    @PostMapping("/add")
    public String add(@ModelAttribute Numbers numbers) {

        int result = numbers.getNum1() + numbers.getNum2();
        return "Result = " + result;
    }
}