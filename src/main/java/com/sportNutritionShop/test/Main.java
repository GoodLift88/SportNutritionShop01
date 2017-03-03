package com.sportNutritionShop.test;

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
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        sessionFactory.getCurrentSession();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();


        User user = new User();

        session.save(user);
        Product product = new Product();

        session.save(product);
        Order order = new Order();
        session.save(order);



        session.getTransaction().commit();
        session.close();
        sessionFactory.getCurrentSession();


    }

}







