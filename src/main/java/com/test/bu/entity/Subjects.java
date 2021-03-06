package com.test.bu.entity;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "subjects")
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(fetch = FetchType.EAGER, targetEntity = Students.class)
    private Students student;
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = User.class)
    private User user;
    private int time;
    private boolean status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Students getStudent() {
        return student;
    }

    public User getUser() {
        return user;
    }

    public boolean isStatus() {
        return status;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
