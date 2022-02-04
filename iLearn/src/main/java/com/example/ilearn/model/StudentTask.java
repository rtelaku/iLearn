package com.example.ilearn.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
public class StudentTask {
    //qeto jon property qe na i ofron hyppernet
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private String Emri;
    @Column
    private String Mbiemri;
    @Column
    private String Datalindjes;
    @Column
    private String Email;
    @Column
    private String NrPersonal;
    @Column
    private String Username;
    @Column
    private String Password;
    @Column
    private String Direction;
    @Column
    private String AcademicGrade;
    @Column
    private String RoleNr;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="student")
    private Student student;



    public StudentTask() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentTask(String emri, String mbiemri, String datalindjes, String email, String nrPersonal, String username, String password, String direction, String academicGrade, String roleNr) {
        Emri = emri;
        Mbiemri = mbiemri;
        Datalindjes = datalindjes;
        Email = email;
        NrPersonal = nrPersonal;
        Username = username;
        Password = password;
        Direction = direction;
        AcademicGrade = academicGrade;
        RoleNr = roleNr;
    }

    public String getEmri() {
        return Emri;
    }

    public void setEmri(String emri) {
        Emri = emri;
    }

    public String getMbiemri() {
        return Mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        Mbiemri = mbiemri;
    }

    public String getDatalindjes() {
        return Datalindjes;
    }

    public void setDatalindjes(String datalindjes) {
        Datalindjes = datalindjes;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNrPersonal() {
        return NrPersonal;
    }

    public void setNrPersonal(String nrPersonal) {
        NrPersonal = nrPersonal;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }

    public String getAcademicGrade() {
        return AcademicGrade;
    }

    public void setAcademicGrade(String academicGrade) {
        AcademicGrade = academicGrade;
    }

    public String getRoleNr() {
        return RoleNr;
    }

    public void setRoleNr(String roleNr) {
        RoleNr = roleNr;
    }
}
