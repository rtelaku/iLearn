package com.example.ilearn.helper;


import java.io.Serializable;


public class EnrollHelper implements Serializable {
    private String name;
    private String lastname;
    private int studentid;
    private String code;
    private int courseid;

    public EnrollHelper() {
    }

    public EnrollHelper(String name, String lastname, int studentid, String code, int courseid) {
        this.name = name;
        this.lastname = lastname;
        this.studentid = studentid;
        this.code = code;
        this.courseid=courseid;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getStudentid() {
        return studentid;
    }

    public String getCode() {
        return code;
    }

    public int getCourseid() {
        return courseid;
    }
}

