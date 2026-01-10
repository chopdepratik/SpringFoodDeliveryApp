package com.fooddelivery.fooddelivery.dao;

import com.fooddelivery.fooddelivery.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public void saveUser(User user){
        jdbcTemplate.update("INSET INTO TABLE user  (userName,email,address,mobNumber)VALUES(?,?,?,?)",user.getUserName(),user.getEmail(),user.getAddress(),user.getMobNumber());
    }

    public void updateUser(User user){
        jdbcTemplate.update("UPDATE TABLE user set (userName=?,email=?) where userId=?",user.getUserName(),user.getEmail(),user.getUserId());

    }

    public void deleteUserById(int id){
        jdbcTemplate.update("DELETE FROM TABLE user WHERE userId=?",id);
    }

    public  User findUserById(int id){
        return  jdbcTemplate.queryForObject("SELECT * FROM user WHERE userId=?",new Object[]{id},(rs,rsNum)->{
            User u1 = new User();

            u1.setUserId(rs.getInt("userId"));
            u1.setUserName(rs.getString("userName"));
            u1.setAddress(rs.getString("address"));
            u1.setMobNumber(rs.getString("mobNumber"));

            return  u1;
        });
    }

    public  User findUserByEmail(String email){
        return  jdbcTemplate.queryForObject("SELECT * FROM user WHERE email=?",new Object[]{email},(rs,rsNum)->{
            User u1 = new User();

            u1.setUserId(rs.getInt("userId"));
            u1.setUserName(rs.getString("userName"));
            u1.setAddress(rs.getString("address"));
            u1.setMobNumber(rs.getString("mobNumber"));

            return  u1;
        });
    }

    public List<User> findAllUsers(){
        return jdbcTemplate.query("SELECT * FROM user",(rs,rsNum)->{
            User u1 = new User();

            u1.setUserId(rs.getInt("userId"));
            u1.setUserName(rs.getString("userName"));
            u1.setAddress(rs.getString("address"));
            u1.setMobNumber(rs.getString("mobNumber"));

            return  u1;
        });
    }
}
