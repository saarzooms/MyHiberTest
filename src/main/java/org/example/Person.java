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
    @Temporal(value=TemporalType.DATE)
    @Column(name="dob")
    private Date dob;
    @Lob
    @Column
    private byte[] myImage;

    private Address address;



    public Person() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
