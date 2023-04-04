package org.example;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="person_details")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="pname",length = 50)
    private String name;
    @Column(name="dob")
    private Date dob;

    @Column
    private byte[] myImage;

    public Person() {
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public byte[] getMyImage() {
        return myImage;
    }

    public void setMyImage(byte[] myImage) {
        this.myImage = myImage;
    }
}
