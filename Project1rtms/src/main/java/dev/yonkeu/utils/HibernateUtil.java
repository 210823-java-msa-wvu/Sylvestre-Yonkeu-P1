package dev.yonkeu.utils;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sf = new Configuration().configure().buildSessionFactory();

    public static Session getSession() { return sf.openSession(); }

    public static SessionFactory getSessionFactory() {
        return null;
    }
}
