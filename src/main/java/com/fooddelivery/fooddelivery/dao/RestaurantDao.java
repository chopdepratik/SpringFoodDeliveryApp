package com.fooddelivery.fooddelivery.dao;

import com.fooddelivery.fooddelivery.model.Restaurant;
import com.fooddelivery.fooddelivery.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RestaurantDao {
    private JdbcTemplate jdbcTemplate;



    public void saveRestaurant(Restaurant restaurant){
        jdbcTemplate.update("INSET INTO TABLE restaurant (restName,deliveryRadius,address,ratings) VALUES(?,?,?)",restaurant.getRestName(),restaurant.getDeliveryRadius(),restaurant.getAddress(),restaurant.getRatings());
    }
    public void updateRestaurant(Restaurant restaurant){
        jdbcTemplate.update("UPDATE TABLE restaurant set (restName=?,deliveryRadius=?,ratings=?) where restId=?",restaurant.getRestName(),restaurant.getDeliveryRadius(),restaurant.getRatings());

    }

    public void deleteRestaurantById(int id){
        jdbcTemplate.update("DELETE FROM TABLE restaurant WHERE restId=?",id);
    }

    public  Restaurant findRestaurantById(int id){
        return  jdbcTemplate.queryForObject("SELECT * FROM restaurant WHERE restId=?",new Object[]{id},(rs,rsNum)->{
            Restaurant r = new Restaurant();

             r.setResId(rs.getInt("restId"));
            r.setRestName(rs.getString("restName"));
            r.setAddress(rs.getString("address"));
            r.setDeliveryRadius(rs.getInt("deliveryRadius"));
            r.setRatings(rs.getInt("ratings"));


            return  r;
        });
    }



    public List<Restaurant> findAllRestaurants(){
        return jdbcTemplate.query("SELECT * FROM restaurant",(rs,rsNum)->{
            Restaurant r = new Restaurant();

            r.setResId(rs.getInt("restId"));
            r.setRestName(rs.getString("restName"));
            r.setAddress(rs.getString("address"));
            r.setDeliveryRadius(rs.getInt("deliveryRadius"));
            r.setRatings(rs.getInt("ratings"));


            return  r;
        });
    }
}
