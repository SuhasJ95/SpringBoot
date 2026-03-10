package com.example.Addition.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdditionResponse {
    private int num1;
    private int num2;
    private int result;
    
}
