package com.example.ilearn.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Administrator {
    @Id
    @Column(name = "AID")
    private int adminID ;
    @Column(name ="Aname")
    private String adminName;
    @Column(name ="ALname")
    private String adminLastName;
    @Column(name ="DoB")
    private LocalDate dateOfBirth;
    @Column
    private String email;
    @Column(name = "NrPersonal")
    private String numriPersonal;
    @Column
    private String username;
    @Column
    private String password;

    //   foreign key ka me kon administratori te taska
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "administrator")
    private Set<AdministratorTask> administratorTasks;
    //qikjo set osht sikur lista mirpo i ka disa veti ma tmira se lista.

    public Set<AdministratorTask> getTasks() {
        return administratorTasks;
    }

    public void setTasks(Set<AdministratorTask> administratorTasks) {
        this.administratorTasks = administratorTasks;
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

    public Administrator() {
    }

    public Administrator(int adminID, String adminName, String adminLastName, LocalDate dateOfBirth, String email, String numriPersonal, String username, String password) {
        this.adminID = adminID;
        this.adminName = adminName;
        this.adminLastName = adminLastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.numriPersonal = numriPersonal;
        this.username = username;
        this.password = password;

    }

    public int getAdminID() {
        return adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
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




}