package com.example.collegeProject.dto.request;

public class LecturerRequest {
    
    private String name;
    private String employeId;
    private String email;
    private String phone;
    private String department;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmployeId() {
        return employeId;
    }
    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    
}
