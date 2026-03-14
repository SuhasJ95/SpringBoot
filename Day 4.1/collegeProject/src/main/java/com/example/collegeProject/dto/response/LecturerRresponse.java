package com.example.collegeProject.dto.response;


public class LecturerRresponse {

    private Long id;
    private String name;
    private String employeId;
    private String email;
    private String phone;
    private String department;

    public LecturerRresponse(Long id, String name, String employeId, String email, String phone, String department) {
        this.id = id;
        this.name = name;
        this.employeId = employeId;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
