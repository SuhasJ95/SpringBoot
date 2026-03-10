package com.example.demo.dto.response;

public class ApiResponse {
    private String status;
    private ProductResponse data;
    
    public ApiResponse(String status, ProductResponse data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductResponse getData() {
        return data;
    }

    public void setData(ProductResponse data) {
        this.data = data;
    }

    
}
