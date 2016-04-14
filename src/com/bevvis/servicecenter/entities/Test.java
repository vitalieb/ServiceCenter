package com.bevvis.servicecenter.entities;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
    public static void main(String[] args) {

        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
                .build();
        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();

        Contractor e1 = new Contractor();
        e1.setAge(33);



        Order o = new Order();
        o.setContractor(e1);

        session.persist(o);

        t.commit();
        session.close();
        System.out.println("successfully saved");
    }
}