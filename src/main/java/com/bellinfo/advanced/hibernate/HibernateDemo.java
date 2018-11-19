package com.bellinfo.advanced.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateDemo {
    public static void main(String[] args) {

        Student stu = new Student();
        stu.setName("vinod");
        stu.setCourse("data integration");


        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();


        session.save(stu);
        tx.commit();
        session.close();
        sf.close();
    }
}
