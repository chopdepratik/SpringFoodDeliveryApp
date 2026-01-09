package com.fooddelivery.fooddelivery;

import com.fooddelivery.fooddelivery.config.AppConfig;
import com.fooddelivery.fooddelivery.controller.OrderController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class FoodDeliveryApplication {



    public static void main(String[] args) throws SQLException {


        Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","Mysqlroot#123");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderController controller = ctx.getBean(OrderController.class);

        controller.createNewOrder();

    }

}
