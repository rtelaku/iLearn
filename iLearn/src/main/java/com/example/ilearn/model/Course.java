package com.example.ilearn.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @Column(name = "CID")
    private String courseID ;
    @Column(name ="Cname")
    private String courseName; //EmriLendes*
    @Column(name = "Type")
    private int type ;
    @Column(name ="ECTS")
    private int ECTS;
    @Column(name ="Semester")
    private String semester;

    public Course() {
    }

    public Course(String courseID, String courseName, int type, int ECTS, String semester) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.type = type;
        this.ECTS = ECTS;
        this.semester = semester;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}