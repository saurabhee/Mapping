package com.scp.onetooneunidirectional;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 
public class Utility {
     
    private static final SessionFactory sessionFactory;
     
    static{
        try{
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
 
        }catch (Throwable ex) {
            System.err.println("Session Factory could not be created." + ex);
            throw new ExceptionInInitializerError(ex);
        }   
    }
     
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
     
}