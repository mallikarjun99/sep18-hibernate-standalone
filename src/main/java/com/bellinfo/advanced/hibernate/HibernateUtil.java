package com.bellinfo.advanced.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;



public class HibernateUtil {

    public static SessionFactory newSessionFactory() {
        Properties pro = new Properties();
        pro.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        pro.put("hibernate.hbm2ddl.auto", "update");
        pro.put("hibernate.show_sql", "true");
        pro.put("hibernate.connection.driver_class", "org.postgresql.Driver");
        pro.put("hibernate.connection.url", "jdbc:postgresql://127.0.0.1:5432/bellinfosep");
        pro.put("hibernate.connection.username", "postgres");
        pro.put("hibernate.connection.password", "srilatha9");

        return new Configuration()
                .addProperties(pro)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory(
                        new StandardServiceRegistryBuilder()
                        .applySettings(pro)
                        .build()
                );

    }
    }


