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


        User user01 = new User();
        User user02 = new User();



        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        Order order5 = new Order();
        Order order6 = new Order();
        Order order7 = new Order();
        Order order8 = new Order();
        Order order9 = new Order();

        order1.setUser(user01);
        order2.setUser(user01);
        order3.setUser(user01);
        order4.setUser(user01);
        order5.setUser(user02);
        order6.setUser(user02);
        order7.setUser(user01);
        order8.setUser(user01);
        order9.setUser(user02);




        Factory.getInstance().getUserDAO().addUser(user01);
        Factory.getInstance().getUserDAO().addUser(user02);

        Factory.getInstance().getOrderDAO().addOrder(order1);
        Factory.getInstance().getOrderDAO().addOrder(order2);
        Factory.getInstance().getOrderDAO().addOrder(order3);
        Factory.getInstance().getOrderDAO().addOrder(order4);
        Factory.getInstance().getOrderDAO().addOrder(order5);
        Factory.getInstance().getOrderDAO().addOrder(order6);
        Factory.getInstance().getOrderDAO().addOrder(order7);
        Factory.getInstance().getOrderDAO().addOrder(order8);
        Factory.getInstance().getOrderDAO().addOrder(order9);




    }

}







