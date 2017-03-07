package com.sportNutritionShop.test;

import com.factory.Factory;
import com.factory.HibernateUtil;

import com.sportNutritionShop.entity.Order;
import com.sportNutritionShop.entity.User;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lekter on 28.02.2017.
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        HibernateUtil.init();


User user = new User();
Order order = new Order();








        Factory.getInstance().getOrderDAO().addOrder(order);
        Factory.getInstance().getUserDAO().addUser(user);








    }

}







