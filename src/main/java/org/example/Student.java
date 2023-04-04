package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="student_details")
public class Student {
    @Id
    @Column(name="stu_id")
    private int id;
    @Column(name="stu_name",length = 50)
    private String name;
    @Column(name="stu_age")
    private int age;
    @Column(name="stu_gender",length = 10)
    private String gender;

    @ManyToOne
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.getId()+" " +this.getName()+" "+this.getGender()+" "+this.getAge();
    }
}
