package com.example.ilearn.EnrollStrategy;


public class Enroll implements ToEnrollStrategy {
    private String name;
    private String lastname;
    private int studentid;
    private String code;
    private int courseid;

    public Enroll(String name, String lastname, int studentid, String code, int courseid) {
        this.name = name;
        this.lastname = lastname;
        this.studentid = studentid;
        this.code = code;
        this.courseid=courseid;
    }

    @Override
    public void enroll(int studentid) {
        String course ;
    }
}
