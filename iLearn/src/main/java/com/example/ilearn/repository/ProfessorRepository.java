package com.example.ilearn.repository;


import com.example.ilearn.model.Professor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor,Integer> {
    @Query("select p from Professor p where p.username=?1 and p.password=?2")
    Optional<Professor> findProfessorByUsernameAndPassword(String username, String pass);
}