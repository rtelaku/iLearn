package com.example.ilearn.service;


import com.example.ilearn.EnrollStrategy.Enroll;
import com.example.ilearn.EnrollStrategy.ToEnrollStrategy;
import com.example.ilearn.helper.EnrollHelper;
import com.example.ilearn.model.Student;
import com.example.ilearn.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public Student login(String username, String pass) {
        Optional<Student> studentOptional=this.studentRepository.findStudentByUsernameAndPassword(username,pass);

        if(studentOptional.isEmpty()){
            return null;
        }
        return studentOptional.get();
    }
    @Override
    public void add(Student student) {
        studentRepository.save(student);
    }
    @Override
    public void enroll(EnrollHelper enrollHelper) {
        if(enrollHelper.getCode().toUpperCase().equals("CSE1819")){
            EnrollSTD(new Enroll(enrollHelper.getName(),enrollHelper.getLastname(),enrollHelper.getStudentid(),enrollHelper.getCode(),enrollHelper.getCourseid()),enrollHelper.getStudentid());
            //EnrollSTD(new Enroll(enrollHelper.getName(),enrollHelper.getLastname(),enrollHelper.getStudentid(),enrollHelper.getCode(),enrollHelper.getCourseid()));
        }
        else {
            // EnrollSTD(new Enroll(enrollHelper.getName(),enrollHelper.getLastname(),enrollHelper.getStudentid(),enrollHelper.getCode(),enrollHelper.getCourseid()));
        }
    }


    private void EnrollSTD(ToEnrollStrategy toEnrollStrategy, int studentid){

        toEnrollStrategy.enroll(studentid);
    }

}

