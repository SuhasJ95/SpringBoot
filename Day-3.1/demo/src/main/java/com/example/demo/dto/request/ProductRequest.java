package com.example.demo.dto.request;

import java.util.List;

public class ProductRequest {

    private String name;
    private List<Integer>price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Integer> getPrice() {
        return price;
    }
    public void setPrice(List<Integer> price) {
        this.price = price;
    }
    
}
