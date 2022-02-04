package com.example.ilearn.repository;


import com.example.ilearn.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("select s from Student s where s.username=?1 and s.password=?2")
    Optional<Student> findStudentByUsernameAndPassword(String username, String pass);

}