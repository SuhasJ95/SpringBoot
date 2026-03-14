package com.example.collegeProject.service;

import org.springframework.stereotype.Service;

import com.example.collegeProject.dto.request.LecturerRequest;
import com.example.collegeProject.dto.response.LecturerRresponse;
import com.example.collegeProject.entity.LecturerEntity;
import com.example.collegeProject.repository.LecturerRepository;

@Service
public class LecturerService {

    private final LecturerRepository lecturerRepository;

    public LecturerService(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    public LecturerRresponse getResults(LecturerRequest lecturerRequest){
        LecturerEntity lecturerEntity = new LecturerEntity();
        lecturerEntity.setName(lecturerRequest.getName());
        lecturerEntity.setEmployeId(lecturerRequest.getEmployeId());
        lecturerEntity.setDepartment(lecturerRequest.getDepartment());
        lecturerEntity.setEmail(lecturerRequest.getEmail());
        lecturerEntity.setPhone(lecturerRequest.getPhone());

        lecturerRepository.save(lecturerEntity);

        return new LecturerRresponse(lecturerEntity.getId(), lecturerEntity.getName(), lecturerEntity.getEmployeId(), lecturerEntity.getEmail(), lecturerEntity.getPhone(), lecturerEntity.getDepartment());
    }
    
}
