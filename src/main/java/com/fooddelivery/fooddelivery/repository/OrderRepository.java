package com.fooddelivery.fooddelivery.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public void saveOrder(){
        System.out.println("Order Saved to Repository");
    }
}
