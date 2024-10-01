package com.example.management_employ;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Crée une SessionFactory à partir de la configuration de Hibernate
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // En cas d'échec de la création de la SessionFactory, lancer une exception
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }
}