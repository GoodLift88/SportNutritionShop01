package com.sportNutritionShop.implementation;

import com.factory.HibernateUtil;
import com.sportNutritionShop.dao.OrderDAO;
import com.sportNutritionShop.entity.Order;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ImplementOrderDAO implements OrderDAO {


    @Override
    public void addOrder(Order order) throws SQLException {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!!", JOptionPane.OK_OPTION);
        }
    }

    @Override
    public void updateOrder(Order order) throws SQLException {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!!", JOptionPane.OK_OPTION);
        }

    }

    @Override
    public void deleteOrder(Order order) throws SQLException {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!!", JOptionPane.OK_OPTION);
        }

    }

    @Override
    public List<Order> getAllOrders() throws SQLException {
        List orderList = new ArrayList<Order>();
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            orderList = session.createCriteria(Order.class).list();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.OK_OPTION);
        }
        return orderList;


    }


}
