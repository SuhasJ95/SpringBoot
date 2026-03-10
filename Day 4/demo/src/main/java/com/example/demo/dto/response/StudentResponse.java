package com.example.demo.dto.response;

public class StudentResponse {
    
    private long id;
    private String name;
    private String registrationNumber;
    
    public StudentResponse(long id, String name, String registrationNumber) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


}
