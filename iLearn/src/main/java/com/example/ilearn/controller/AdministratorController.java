package com.example.ilearn.controller;


import com.example.ilearn.helper.GeneralResponse;
import com.example.ilearn.helper.LoginHelper;
import com.example.ilearn.model.Administrator;


import com.example.ilearn.service.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrator")

public class AdministratorController {

    @Autowired
    private IAdministratorService administratorService;

    @GetMapping()
    public GeneralResponse getAllAdministrators(){
        List<Administrator> administratorList=this.administratorService.getAllAdministrators();
        if(administratorList==null){
            return new GeneralResponse.GeneralResponseBuilder(401).setError("Exception on something").build();
        }
        return new GeneralResponse.GeneralResponseBuilder<>(201).setMessage("succefullyDone").setData(administratorList).build();
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginHelper login){
        Administrator administrator =this.administratorService.login(login.getUsername(),login.getPassword());

        if(administrator==null){
            return ResponseEntity.notFound().build(); // qikjo e kallxon qe nuk eshte gjete qeky student
            //nese eshte null
        }

        return ResponseEntity.ok(administrator); //kjo ia kthen nese e gjene studentin
    }
}

