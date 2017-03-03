package com.sportNutritionShop.implementation;

import com.factory.HibernateUtil;
import com.sportNutritionShop.dao.UserDAO;
import com.sportNutritionShop.entity.User;
import org.hibernate.Session;

import org.hibernate.query.Query;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lekter on 28.02.2017.
 */

public class ImplementUserDAO implements UserDAO {
    @Override
    public void addUser(User user) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    @Override
    public void updateUser(User user) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    @Override
    public void deleteUser(User user) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    @Override
    public User getUserByS_Name(String s_name) throws SQLException {
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM User WHERE s_name =: s_name");
            query.setParameter("s_name", s_name);
            user = (User) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return user;


    }

    @Override
    public User getUserByName(String name) throws SQLException {
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM User WHERE name =: name");
            query.setParameter("name", name);
            user = (User) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return user;


    }

    @Override
    public User getUserById(long user_id) throws SQLException {
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM User WHERE user_id =:id");
            query.setParameter("id", user_id);
            user = (User) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return user;

    }


    @Override
    public User getUserByNumber(String number) throws SQLException {
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM User WHERE number =: number");
            query.setParameter("number", number);
            user = (User) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return user;
    }

    @Override
    public User getUserByMail(String email) throws SQLException {
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM User WHERE email =: email");
            query.setParameter("email", email);
            user = (User) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return user;
    }

    @Override
    public List<User> getAllUsers() throws SQLException {
        Session session = null;
        List userList = new ArrayList<User>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            userList = session.createCriteria(User.class).list();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return userList;


    }
}
