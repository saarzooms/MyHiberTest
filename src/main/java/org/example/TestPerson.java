package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.setDob(new Date());
        p.setName("Raju");

        try {
            FileInputStream fs = new FileInputStream("src/main/resources/tortoise.png");
            p.setMyImage(fs.readAllBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Address address = new Address();
        address.setStreet("My street");
        address.setCity("Rajkot");
        address.setState("Gujarat");
        address.setCountry("India");
        p.setAddress(address);

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session =  factory.openSession();

        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();

        session.close();

        factory.close();

    }
}
