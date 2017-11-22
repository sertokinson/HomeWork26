package com.sbt.hibernate.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import java.util.List;

/**
 * Created by 15 on 20.11.2017.
 */
public class Example {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("MyBook");
        book.getTags().add("Tag1");
        book.getTags().add("Tag2");
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();

        session=sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery("from Book").list();

        for (Book event:(List<Book>) result) {
            System.out.println(event.getName());
        }
        session.getTransaction().commit();
    }
}
