package com.bellinfo.advanced.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteDemo {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Student st = session.get(Student.class,3);
        System.out.println(st);
        session.delete(st);
        tx.commit();
        session.close();
        sf.close();
    }
}
