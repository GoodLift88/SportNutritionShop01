package com.sportNutritionShop.dao;

import com.sportNutritionShop.entity.Product;


import java.sql.SQLException;
import java.util.List;


public interface ProductDAO {
    public void addProduct(Product product) throws SQLException;
    public void updateProduct(Product product) throws SQLException;
    public void deleteProduct(Product product) throws SQLException;
    public Product getProductByBrand(String brand) throws SQLException;
    public Product getProductByType(String type) throws SQLException;
    public Product getProductId(long id)throws SQLException;
    public Product getProductByCategory(String category) throws SQLException;
    public Product getProductByWeight (double weight) throws SQLException;
    public Product getProductByPrice(double price) throws SQLException;
    public List getAllProducts() throws SQLException;
}
