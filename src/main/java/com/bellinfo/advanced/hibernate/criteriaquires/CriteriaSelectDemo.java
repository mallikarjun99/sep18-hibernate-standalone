package com.bellinfo.advanced.hibernate.criteriaquires;

import com.bellinfo.advanced.hibernate.HibernateUtil;
import com.bellinfo.advanced.hibernate.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class CriteriaSelectDemo {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Criteria c = session.createCriteria(Student.class);

        Projection p = Projections.property("name");
        Criterion cr = Restrictions.gt("id", 2 );
        c.setProjection(p);
        c.add(cr);

        List<String> list = c.list();
        for(String s : list)
            System.out.println(s);

        session.close();
        sf.close();
    }
}
