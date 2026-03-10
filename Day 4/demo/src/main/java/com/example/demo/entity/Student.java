package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "username")
    private String name;

    @OneToOne
    @JoinColumn(name = "registration_id")
    private RegisterNUmberEntity registrationNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RegisterNUmberEntity getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(RegisterNUmberEntity registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

 
    

}
