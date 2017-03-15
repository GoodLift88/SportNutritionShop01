package com.sportNutritionShop.test;

import com.factory.Factory;
import com.factory.HibernateUtil;

import com.sportNutritionShop.entity.Order;
import com.sportNutritionShop.entity.Product;
import com.sportNutritionShop.entity.User;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

    public static void main(String[] args) throws SQLException {
        HibernateUtil.init();


        User user01 = new User();
        User user02 = new User();
        User user03 = new User();
        User user04 = new User();


        Product product = new Product();


        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        Order order5 = new Order();
        Order order6 = new Order();
        Order order7 = new Order();
        Order order8 = new Order();
        Order order9 = new Order();
        Order order10 = new Order();


        order1.setUser(user01);
        order2.setUser(user01);
        order3.setUser(user01);
        order4.setUser(user01);
        order5.setUser(user02);
        order6.setUser(user02);
        order7.setUser(user02);
        order8.setUser(user02);
        order9.setUser(user03);
        order10.setUser(user04);
        Set<Order>orders=new HashSet<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        product.setOrders(orders);




        Factory.getInstance().getUserDAO().addUser(user01);
        Factory.getInstance().getUserDAO().addUser(user02);
        Factory.getInstance().getUserDAO().addUser(user03);
        Factory.getInstance().getUserDAO().addUser(user04);

        Factory.getInstance().getOrderDAO().addOrder(order1);
        Factory.getInstance().getOrderDAO().addOrder(order2);
        Factory.getInstance().getOrderDAO().addOrder(order3);
        Factory.getInstance().getOrderDAO().addOrder(order4);
        Factory.getInstance().getOrderDAO().addOrder(order5);
        Factory.getInstance().getOrderDAO().addOrder(order6);
        Factory.getInstance().getOrderDAO().addOrder(order7);
        Factory.getInstance().getOrderDAO().addOrder(order8);
        Factory.getInstance().getOrderDAO().addOrder(order9);
        Factory.getInstance().getOrderDAO().addOrder(order10);
        Factory.getInstance().getProductDAO().addProduct(product);


    }

}







