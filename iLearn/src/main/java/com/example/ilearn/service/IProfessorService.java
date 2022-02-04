package com.example.ilearn.service;

import com.example.ilearn.model.Professor;

import java.util.List;

public interface IProfessorService {
    List<Professor> getAllProfessors();
    Professor login(String username, String pass);
}