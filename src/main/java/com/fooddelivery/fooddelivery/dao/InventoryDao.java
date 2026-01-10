package com.fooddelivery.fooddelivery.dao;

import com.fooddelivery.fooddelivery.model.Inventory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class InventoryDao {
    private JdbcTemplate jdbcTemplate;

    public InventoryDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Inventory inventory){
        jdbcTemplate.update("INSERT INTO inventory VALUES(?,?,?)",inventory.getInId(102),inventory.getInName(),inventory.getPrice());

    }

    public void update(Inventory inventory){
        jdbcTemplate.update("UPDATE TABLE inventory SET (inName=?,price=?) where inId=?",inventory.getInName(),inventory.getPrice(),inventory.getInId(102));
    }

    RowMapper<Inventory> innventoryRoWMapper = ((rs, rowNum) -> {
        Inventory i = new Inventory();
        i.setInId(rs.getInt("inId"));
        i.setPrice(rs.getDouble("price"));
        i.setInName(rs.getString("inName"));
        return  i;
    });

    public List<Inventory> findAll(){
        return  jdbcTemplate.query("select * from inventory",innventoryRoWMapper);
    }

    public void deleteById(int id){
         jdbcTemplate.update("delete from inventory where inId=?",id);
    }

    public Inventory getInventoryById(int id){

        return jdbcTemplate.queryForObject("select * from inventory where inId=?",new Object[]{id},((rs, rowNum) -> {
            Inventory inventory  =  new Inventory();
            inventory.setInId(rs.getInt("inId"));
            inventory.setPrice(rs.getDouble("price"));
            inventory.setInName(rs.getString("inName"));
            System.out.println(inventory);

            return  inventory;
        }));
    }
}
