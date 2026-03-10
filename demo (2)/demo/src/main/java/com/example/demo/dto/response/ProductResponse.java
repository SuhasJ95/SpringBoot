package com.example.demo.dto.response;

public class ProductResponse {
    
    private String name;
    private int total;
    private double percentage;
    private int nettotal;
    private int GST=18;
    
    public ProductResponse(String name, int total, double percentage, int nettotal, int gST) {
        this.name = name;
        this.total = total;
        this.percentage = percentage;
        this.nettotal = nettotal;
        GST = gST;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getNettotal() {
        return nettotal;
    }

    public void setNettotal(int nettotal) {
        this.nettotal = nettotal;
    }

    public int getGST() {
        return GST;
    }

    public void setGST(int gST) {
        GST = gST;
    }
    
   
    
}
