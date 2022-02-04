package com.example.ilearn.service;


import com.example.ilearn.model.Professor;

import com.example.ilearn.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService implements IProfessorService {
    @Autowired
    public ProfessorRepository professorRepository;

    @Override
    public List<Professor> getAllProfessors() {
        return this.professorRepository.findAll();
    }

    @Override
    public Professor login(String username, String pass) {
        Optional<Professor> professorOptional=this.professorRepository.findProfessorByUsernameAndPassword(username,pass);

        if(professorOptional.isEmpty()){
            return null;
        }
        return professorOptional.get();
    }
}

