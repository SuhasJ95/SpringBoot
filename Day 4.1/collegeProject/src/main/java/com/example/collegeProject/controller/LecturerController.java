package com.example.collegeProject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegeProject.dto.request.LecturerRequest;
import com.example.collegeProject.dto.response.ApiResponse;
import com.example.collegeProject.dto.response.LecturerRresponse;
import com.example.collegeProject.service.LecturerService;

@RestController
@RequestMapping("/lecturer")
public class LecturerController {
    private final LecturerService service;

    public LecturerController(LecturerService service) {
        this.service = service;
    }
    
@PostMapping("/result")
public ApiResponse<LecturerRresponse> createLecturer(@RequestBody LecturerRequest req){

    LecturerRresponse results = service.getResults(req);
    return new ApiResponse<>("success", results);
}
}
