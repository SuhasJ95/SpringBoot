package com.example.Addition.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Addition.dto.request.AdditionRequest;
import com.example.Addition.dto.response.AdditionResponse;
import com.example.Addition.dto.response.ApiResponse;
import com.example.Addition.service.AdditionService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/addition")
public class AdditionController {
    
private final AdditionService additionService;

public AdditionController(AdditionService additionService) {
    this.additionService = additionService;

}

@PostMapping("/add")
public ApiResponse addnumber(@RequestBody AdditionRequest request) {

    AdditionResponse response = additionService.createnumber(request);
    return new ApiResponse("Success", response);
}
}
