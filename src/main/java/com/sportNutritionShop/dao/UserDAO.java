package com.sportNutritionShop.dao;

import com.sportNutritionShop.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Lekter on 28.02.2017.
 */
public interface UserDAO {
    public void addUser(User user) throws SQLException;
    public void updateUser(User user) throws SQLException;
    public void deleteUser(User user) throws SQLException;
    public User getUserByS_Name(String s_name) throws SQLException;
    public User getUserByName(String name) throws SQLException;
    public User getUserById(long user_id)throws SQLException;
    public User getUserByNumber(String number) throws SQLException;
    public User getUserByMail (String email) throws SQLException;
    public List getAllUsers() throws SQLException;
}
