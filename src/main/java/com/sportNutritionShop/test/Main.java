package com.sportNutritionShop.test;

import com.factory.Factory;
import com.factory.HibernateUtil;

import com.sportNutritionShop.entity.Order;
import com.sportNutritionShop.entity.Product;
import com.sportNutritionShop.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Date;
import java.sql.SQLException;
import java.time.Year;

/**
 * Created by Lekter on 28.02.2017.
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        HibernateUtil.init();



        User user = new User();

        Factory.getInstance().getUserDAO().addUser(user);
        Product product = new Product();
        Order order = new Order();
        Factory.getInstance().getOrderDAO().addOrder(order);
        Factory.getInstance().getProductDAO().addProduct(product);






    }

}







