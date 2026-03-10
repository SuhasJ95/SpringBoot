package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.StudentRequest;
import com.example.demo.dto.response.StudentResponse;
import com.example.demo.entity.RegisterNUmberEntity;
import com.example.demo.entity.Student;
import com.example.demo.repository.RegisterNumberRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
    
     private final StudentRepository studentRepository;
     private final RegisterNumberRepository registerNumberRepository;

    public StudentService(StudentRepository studentRepository, RegisterNumberRepository registerNumberRepository) {
        this.studentRepository = studentRepository;
        this.registerNumberRepository = registerNumberRepository;
    }

     public StudentResponse getStudentResponse(StudentRequest studentRequest) {
        Student student = new Student();
        student.setName(studentRequest.getName());
        Student savedStudent = studentRepository.save(student);
        return new StudentResponse(savedStudent.getId(), savedStudent.getName(), savedStudent.getRegistrationNumber().getRegNumber());
        
        
     }

      public StudentResponse assignRegistration(Long StudentId,String regNumber) {

        Student student = studentRepository.findById(StudentId).orElseThrow(() -> new RuntimeException("Student not found"));

        RegisterNUmberEntity register = new RegisterNUmberEntity();
        register.setRegNumber(regNumber);
        RegisterNUmberEntity savedRegister = registerNumberRepository.save(register);

        student.setRegistrationNumber(savedRegister);

        studentRepository.save(student);

        return new StudentResponse(student.getId(), student.getName(), savedRegister.getRegNumber());

}
}