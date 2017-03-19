package com.factory;

import com.fasterxml.classmate.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Lekter on 28.02.2017.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try{
            sessionFactory = new Configuration().configure().buildSessionFactory();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public  static void init(){}
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}


