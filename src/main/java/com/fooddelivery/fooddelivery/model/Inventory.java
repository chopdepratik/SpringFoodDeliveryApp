package com.fooddelivery.fooddelivery.model;

public class Inventory {
    private int inId;
    private String inName;
    private double price;



    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + inId +
                ", name='" + inName + '\'' +
                ", price=" + price +
                '}';
    }
    public int getInId(int i) {
        return inId;
    }

    public void setInId(int inId) {
        this.inId = inId;
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
