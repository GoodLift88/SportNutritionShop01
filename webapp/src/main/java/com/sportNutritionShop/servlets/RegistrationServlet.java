package com.sportNutritionShop.servlets;

import com.factory.Factory;
import com.sportNutritionShop.entity.User;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Lekter on 16.03.2017.
 */
public class RegistrationServlet extends APIHandlerServlet.APIRequestHandler {

    public static final RegistrationServlet instance = new RegistrationServlet();


    public static RegistrationServlet getInstance() {
        return instance;
    }

    private RegistrationServlet() {
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest request) throws Exception {
      String name = request.getParameter("firstName");
        String s_name = request.getParameter("lastName");
        String email  = request.getParameter("Email");
        String phone  = request.getParameter("phoneNumber");
        String password = request.getParameter("Password");
        User user = new User() ;
        user.setName(name);
        user.setS_name(s_name);
        user.setEmail(email);
        user.setNumber(phone);
        user.setPassword(password);
        Factory.getInstance().getUserDAO().addUser(user);


        return null;
    }
}
