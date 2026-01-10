package com.fooddelivery.fooddelivery.model;

public class Restaurant {
    private int resId;
    private String restName;
    private int deliveryRadius;

    @Override
    public String toString() {
        return "Restaurant{" +
                "resId=" + resId +
                ", restName='" + restName + '\'' +
                ", deliveryRadius=" + deliveryRadius +
                ", address='" + address + '\'' +
                ", ratings=" + ratings +
                '}';
    }

    private String address;
    private int ratings;

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public int getDeliveryRadius() {
        return deliveryRadius;
    }

    public void setDeliveryRadius(int deliveryRadius) {
        this.deliveryRadius = deliveryRadius;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
