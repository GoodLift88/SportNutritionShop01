package com.factory;


import com.sportNutritionShop.dao.OrderDAO;
import com.sportNutritionShop.dao.ProductDAO;
import com.sportNutritionShop.dao.UserDAO;
import com.sportNutritionShop.implementation.ImplementOrderDAO;
import com.sportNutritionShop.implementation.ImplementProductDAO;
import com.sportNutritionShop.implementation.ImplementUserDAO;

/**
 * Created by Lekter on 28.02.2017.
 */
public class Factory {
    private static UserDAO userDAO = null;
    private static  ProductDAO productDAO = null;
    private static OrderDAO orderDAO = null;


    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public UserDAO getUserDAO() {
        if (userDAO == null) {
            userDAO = (UserDAO) new ImplementUserDAO();
        }
        return userDAO;
    }


    public ProductDAO getProductDAO(){
        if (productDAO==null){
            productDAO =(ProductDAO) new ImplementProductDAO();
        }
        return productDAO;
    }
    public OrderDAO getOrderDAO(){
        if(orderDAO==null){
            orderDAO = (OrderDAO) new ImplementOrderDAO();
        }
        return orderDAO;
    }

}
