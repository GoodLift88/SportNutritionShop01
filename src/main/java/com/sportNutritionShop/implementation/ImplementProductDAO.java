package com.sportNutritionShop.implementation;

import com.factory.HibernateUtil;
import com.sportNutritionShop.dao.ProductDAO;
import com.sportNutritionShop.entity.Product;

import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lekter on 02.03.2017.
 */
public class ImplementProductDAO implements ProductDAO {
    @Override
    public void addProduct(Product product) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }


    @Override
    public void updateProduct(Product product) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    @Override
    public void deleteProduct(Product product) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    @Override
    public Product getProductByBrand(String brand) throws SQLException {
        Product product = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM Product WHERE brand =: brand");
            query.setParameter("brand", brand);
            product = (Product) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return product;
    }

    @Override
    public Product getProductByType(String type) throws SQLException {
        Product product = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM Product WHERE type =: type");
            query.setParameter("type", type);
            product = (Product) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();


        }
        return product;
    }

    @Override
    public Product getProductId(long id) throws SQLException {
        Product product = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM Product WHERE id =: id");
            query.setParameter("id", id);
            product = (Product) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return product;
    }

    @Override
    public Product getProductByCategory(String category) throws SQLException {
        Product product = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM Product WHERE category =: category");
            query.setParameter("category", category);
            product = (Product) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return product;
    }

    @Override
    public Product getProductByWeight(double weight) throws SQLException {
        Product product = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM Product WHERE weight =: weight");
            query.setParameter("weight", weight);
            product = (Product) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return product;
    }

    @Override
    public Product getProductByPrice(double price) throws SQLException {
        Product product = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM Product WHERE price =: price");
            query.setParameter("price", price);
            product = (Product) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return product;
    }

    @Override
    public List getAllProducts() throws SQLException {
        Session session = null;
        List productsList = new ArrayList<Product>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            productsList = session.createCriteria(Product.class).list();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return productsList;


    }
}