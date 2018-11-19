package com.bellinfo.advanced.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateDemo {

    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Student stu = session.get(Student.class,1);
        stu.setName("bhuji");
        session.update(stu);
        tx.commit();
        session.close();
        sf.close();
    }
}
