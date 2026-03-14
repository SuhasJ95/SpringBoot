package com.example.collegeProject.service;

import org.springframework.stereotype.Service;

import com.example.collegeProject.dto.request.StudentRequest;
import com.example.collegeProject.dto.response.StudentResponse;
import com.example.collegeProject.entity.LecturerEntity;
import com.example.collegeProject.entity.StudentEntity;
import com.example.collegeProject.repository.LecturerRepository;
import com.example.collegeProject.repository.StudentRepository;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;
    private final LecturerRepository lecturerRepository;

   
    
    public StudentService(StudentRepository studentRepository, LecturerRepository lecturerRepository) {
        this.studentRepository = studentRepository;
        this.lecturerRepository = lecturerRepository;
    }



   public StudentResponse getResults(Long lecturerId, StudentRequest studentRequest){

    LecturerEntity lecturer =
        lecturerRepository.findById(lecturerId)
        .orElseThrow(() -> new RuntimeException("Lecturer not found"));

    StudentEntity studentEntity = new StudentEntity();

    studentEntity.setName(studentRequest.getName());
    studentEntity.setRegisterNumber(studentRequest.getRegisterNumber());
    studentEntity.setEmail(studentRequest.getEmail());
    studentEntity.setPhone(studentRequest.getPhone());
    studentEntity.setDepartment(studentRequest.getDepartment());
    studentEntity.setYear(studentRequest.getYear());

    
    studentEntity.setLecturerEntity(lecturer);

    studentRepository.save(studentEntity);

    return new StudentResponse(
        studentEntity.getId(),
        studentEntity.getName(),
        studentEntity.getRegisterNumber(),
        studentEntity.getEmail(),
        studentEntity.getPhone(),
        studentEntity.getDepartment(),
        studentEntity.getYear()
    );
}
}
