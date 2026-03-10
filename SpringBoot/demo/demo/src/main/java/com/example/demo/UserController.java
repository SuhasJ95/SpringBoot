package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/add/{num1}/{num2}")
    public int addNumbers(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }
}