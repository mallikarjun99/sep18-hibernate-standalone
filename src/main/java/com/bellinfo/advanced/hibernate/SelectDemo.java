package com.bellinfo.advanced.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SelectDemo {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Student s = session.get(Student.class,5);
        System.out.println(s.getCourse());

        session.close();
        sf.close();

    }
}
