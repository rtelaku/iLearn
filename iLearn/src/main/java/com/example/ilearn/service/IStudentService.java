package com.example.ilearn.service;


import com.example.ilearn.helper.EnrollHelper;
import com.example.ilearn.model.Student;


import java.util.List;

public interface IStudentService {
    List<Student> getAllStudents();
    Student login(String username, String pass);
    void enroll(EnrollHelper enrollHelper);
    void add(Student student);
}