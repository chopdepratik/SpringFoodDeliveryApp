package com.fooddelivery.fooddelivery.dao;

import com.fooddelivery.fooddelivery.model.Inventory;
import org.springframework.jdbc.core.JdbcTemplate;

public class InventoryDao {
    private JdbcTemplate jdbcTemplate;

    public InventoryDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Inventory inventory){
        jdbcTemplate.update("INSERT INTO inventory VALUES(?,?,?)",inventory.getInid(),inventory.getInName(),inventory.getPrice());
        
    }
}
