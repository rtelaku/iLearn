package com.example.ilearn.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Student {
    @Id
    @Column
    private int studentID ;
    @Column
    private String studentName;
    @Column
    private String studentLastName;
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @Column
    private String email;
    @Column
    private String numriPersonal;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String drejtimi;
    @Column
    private int roli;
    @Column
    private String gradaAkademike;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private Set<User> users = new HashSet<>(0);

    //   foreign key ka me kon studenti te taska
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<StudentTask> studentTasks;
    //qikjo set osht sikur lista mirpo i ka disa veti ma tmira se lista.

    public Set<StudentTask> getTasks() {
        return studentTasks;
    }

    public void setTasks(Set<StudentTask> studentTasks) {
        this.studentTasks = studentTasks;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student() {
    }

    public Student(String studentName, String studentLastName, LocalDate dateOfBirth, String email, String numriPersonal, String username, String password, String drejtimi,int roli) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.numriPersonal = numriPersonal;
        this.username = username;
        this.password = password;
        this.drejtimi = drejtimi;
        this.roli = roli;

    }


    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumriPersonal() {
        return numriPersonal;
    }

    public void setNumriPersonal(String numriPersonal) {
        this.numriPersonal = numriPersonal;
    }

    public String getDrejtimi() {
        return drejtimi;
    }

    public void setDrejtimi(String drejtimi) {
        this.drejtimi = drejtimi;
    }

    public int getRoli() {
        return roli;
    }

    public void setRoli(int roli) {
        this.roli = roli;
    }

}

