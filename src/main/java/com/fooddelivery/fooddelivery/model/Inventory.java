package com.fooddelivery.fooddelivery.model;

public class Inventory {
    private int Inid;
    private String inName;
    private double price;

    public int getInid() {
        return Inid;
    }

    public void setInid(int inid) {
        Inid = inid;
    }

    public String getInName() {
        return inName;
    }

    public void setInName(String inName) {
        this.inName = inName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
