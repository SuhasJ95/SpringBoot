package com.example.collegeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegeProject.entity.LecturerEntity;

public interface LecturerRepository extends JpaRepository<LecturerEntity,Long>{
    
}
