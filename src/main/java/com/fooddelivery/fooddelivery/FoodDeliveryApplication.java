package com.fooddelivery.fooddelivery;

import com.fooddelivery.fooddelivery.config.AppConfig;
import com.fooddelivery.fooddelivery.controller.OrderController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
public class FoodDeliveryApplication {



    public static void main(String[] args) throws SQLException {



        //Plain JDBC
//        Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","#Mysqlroot#123");
//
//        PreparedStatement ps2 = con.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?)");
//        ps2.setInt(1,1);
//        ps2.setString(2,"Pratik");
//        ps2.setString(3,"pratik@gmail.com");
//        ps2.setString(4,"Nagpur");
//        ps2.setString(5,"9021289506");
//
//        ps2.execute();
//
//        ps2.close();
//        con.close();

        //Spring JDBC










//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        OrderController controller = ctx.getBean(OrderController.class);
//
//        controller.createNewOrder();

    }

}
