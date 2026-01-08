package com.fooddelivery.fooddelivery;

import com.fooddelivery.fooddelivery.config.AppConfig;
import com.fooddelivery.fooddelivery.controller.OrderController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FoodDeliveryApplication {



    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderController controller = ctx.getBean(OrderController.class);

        controller.placeOrder();

    }

}
