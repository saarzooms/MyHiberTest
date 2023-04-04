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

        Subject sub2 = new Subject();
        sub2.setId(104);
        sub2.setName("AWT");
        sub2.setDuration("6 months");


        Student stu = new Student();
        stu.setId(1);
        stu.setName("Arzoo");
        stu.setGender("M");
        stu.setAge(34);


        Student stu2 = new Student();
        stu2.setId(2);
        stu2.setName("Vikas");
        stu2.setGender("M");
        stu2.setAge(32);

        Student stu3 = new Student();
        stu3.setId(3);
        stu3.setName("Maya");
        stu3.setGender("F");
        stu3.setAge(30);



        List<Student> stuList = new ArrayList<Student>();
        stuList.add(stu);
        stuList.add(stu2);

        sub.setStudents(stuList);


        List<Student> stuList2 = new ArrayList<Student>();
        stuList2.add(stu);
        stuList2.add(stu2);
        stuList2.add(stu3);

        sub.setStudents(stuList);
        sub2.setStudents(stuList2);

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(sub);
        subjectList.add(sub2);

        stu.setSubjects(subjectList);
        stu2.setSubjects(subjectList);

        List<Subject> subList = new ArrayList<>();
        subList.add(sub2);

        stu3.setSubjects(subList);


    Session session = factory.openSession();
    session.beginTransaction();
    session.save(stu);
    session.save(stu2);
    session.save(stu3);
    session.save(sub);
    session.save(sub2);
    session.getTransaction().commit();
    session.close();
        factory.close();
    }
}
