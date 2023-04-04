package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="subject_details")
public class Subject {
    @Id
    @Column(name="sub_id")
    private int id;
    @Column(name="sub_name", length = 50)
    private String name;
    @Column(name="duration", length=10)
    private String duration;

    @ManyToMany
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Subject() {
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
