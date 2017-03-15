package com.sportNutritionShop.dao;

import com.sportNutritionShop.entity.Order;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Created by Lekter on 02.03.2017.
 */
public interface OrderDAO {
    public void addOrder(Order order) throws SQLException;


    public void updateOrder(Order order) throws SQLException;

    public void deleteOrder(Order order) throws SQLException;
    public List getAllOrders() throws SQLException;

}
