
package com.example.management_employ;
import com.example.management_employ.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        try (Session session = HibernateUtil.getSession()) {
            if (session != null && session.isOpen()) {
                System.out.println("La connexion à la base de données a réussi !");
            } else {
                System.out.println("La connexion à la base de données a échoué !");
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        }
    }
}