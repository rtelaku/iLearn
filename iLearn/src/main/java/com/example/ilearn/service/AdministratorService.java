package com.example.ilearn.service;


import com.example.ilearn.model.Administrator;

import com.example.ilearn.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministratorService implements IAdministratorService {
    @Autowired
    public AdministratorRepository administratorRepository;

    @Override
    public List<Administrator> getAllAdministrators() {
        return this.administratorRepository.findAll();
    }

    @Override
    public Administrator login(String username, String pass) {
        Optional<Administrator> administratorOptional=this.administratorRepository.findAdminByUsernameAndPassword(username,pass);

        if(administratorOptional.isEmpty()){
            return null;
        }
        return administratorOptional.get();
    }
}

