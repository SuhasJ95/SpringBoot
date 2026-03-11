package com.example.demo.dto.response;

import java.util.List;

public class ProductResponse {
    
    private String name;
    private long id;
    private int GST;
    private int total;
    private int nettotal;
    private List<Integer> price;
    
    public ProductResponse(String name, Long id, int gST, int total, int nettotal, List<Integer> price) {
        this.name = name;
        this.id = id;
        GST = gST;
        this.total = total;
        this.nettotal = nettotal;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGST() {
        return GST;
    }

    public void setGST(int gST) {
        GST = gST;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNettotal() {
        return nettotal;
    }

    public void setNettotal(int nettotal) {
        this.nettotal = nettotal;
    }

    public List<Integer> getPrice() {
        return price;
    }

    public void setPrice(List<Integer> price) {
        this.price = price;
    }
    
   

}
