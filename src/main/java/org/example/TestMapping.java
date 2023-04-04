package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class TestMapping {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .buildSessionFactory();
        Subject sub = new Subject();
        sub.setId(103);
        sub.setName("AJ");
        sub.setDuration("6 months");


        Student stu = new Student();
        stu.setId(1);
        stu.setName("Arzoo");
        stu.setGender("M");
        stu.setAge(34);
        stu.setSubject(sub);

        Student stu2 = new Student();
        stu2.setId(2);
        stu2.setName("Vikas");
        stu2.setGender("M");
        stu2.setAge(32);
        stu2.setSubject(sub);


        List<Student> stuList = new ArrayList<Student>();
        stuList.add(stu);
        stuList.add(stu2);

        sub.setStudents(stuList);




    Session session = factory.openSession();
    session.beginTransaction();
    session.save(stu);
    session.save(stu2);
    session.save(sub);
    session.getTransaction().commit();
    session.close();
        factory.close();
    }
}
