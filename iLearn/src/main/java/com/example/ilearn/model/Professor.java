package com.example.ilearn.model;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Professor {
    @Id
    @Column(name = "PID")
    private int professorID ;
    @Column(name ="Pname")
    private String professorName;
    @Column(name ="PLname")
    private String professorLastName;
    @Column(name ="DoB")
    private Date dateOfBirth;
    @Column
    private String email;
    @Column(name = "NrPersonal")
    private String numriPersonal;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String GradaAkademike;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professor")
    private Set<ProffesorTask> professorTasks;
    //qikjo set osht sikur lista mirpo i ka disa veti ma tmira se lista.

    public Set<ProffesorTask> getTasks() {
        return professorTasks;
    }

    public void setTasks(Set<ProffesorTask> professorTasks) {
        this.professorTasks = professorTasks;
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

    public Professor() {
    }

    public Professor(int professorID, String professorName, String professorLastName, Date dateOfBirth, String email, String numriPersonal, String username, String password, String GradaAkademike) {
        this.professorID = professorID;
        this.professorName = professorName;
        this.professorLastName = professorLastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.numriPersonal = numriPersonal;
        this.username = username;
        this.password = password;
        this.GradaAkademike = GradaAkademike;
    }

    public int getProfessorID() {
        return professorID;
    }

    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorLastName() {
        return professorLastName;
    }

    public void setProfessorLastName(String professorLastName) {
        this.professorLastName = professorLastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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


    public String getGradaAkademike() {
        return GradaAkademike;
    }

    public void setGradaAkademike (String GradaAkademike) {
        this.GradaAkademike = GradaAkademike;
    }
}
