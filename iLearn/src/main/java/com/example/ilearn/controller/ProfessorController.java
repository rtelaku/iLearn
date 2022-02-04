package com.example.ilearn.controller;


import com.example.ilearn.helper.GeneralResponse;
import com.example.ilearn.helper.LoginHelper;
import com.example.ilearn.model.Professor;

import com.example.ilearn.service.IProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professor")

public class ProfessorController {
    @Autowired
    private IProfessorService professorService;

    @GetMapping()
    public GeneralResponse getAllProfessors(){
        List<Professor> professorList=this.professorService.getAllProfessors();
        if(professorList==null){
            return new GeneralResponse.GeneralResponseBuilder(401).setError("Exception on something").build();
        }
        return new GeneralResponse.GeneralResponseBuilder<>(201).setMessage("succefullyDone").setData(professorList).build();
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginHelper login){
        Professor professor =this.professorService.login(login.getUsername(),login.getPassword());

        if(professor==null){
            return ResponseEntity.notFound().build(); // qikjo e kallxon qe nuk eshte gjete qeky student
            //nese eshte null
        }

        return ResponseEntity.ok(professor); //kjo ia kthen nese e gjene studentin
    }
}

