package com.example.Addition.service;

import org.springframework.stereotype.Service;

import com.example.Addition.dto.request.AdditionRequest;
import com.example.Addition.dto.response.AdditionResponse;
import com.example.Addition.entity.AdditionEntity;
import com.example.Addition.repository.AdditionRepository;

@Service
public class AdditionService {
    
    private final AdditionRepository additionRepository;

    public AdditionService(AdditionRepository additionRepository) {
        this.additionRepository = additionRepository;
    }

    public AdditionResponse createnumber(AdditionRequest request) {
        int num1 = request.getNum1();
        int num2 = request.getNum2();
        int result = num1 + num2;

        AdditionEntity additionEntity = new AdditionEntity();
        additionEntity.setNum1(request.getNum1());
        additionEntity.setNum2(request.getNum2());
        additionEntity.setResult(result);

        AdditionEntity savedEntity = additionRepository.save(additionEntity);
        AdditionResponse response = new AdditionResponse();
        response.setNum1(savedEntity.getNum1());
        response.setNum2(savedEntity.getNum2());
        response.setResult(savedEntity.getResult());

        return new AdditionResponse(savedEntity.getNum1(), savedEntity.getNum2(), savedEntity.getResult());

    }

    
}
