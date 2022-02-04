package com.example.ilearn.service;


import com.example.ilearn.model.Administrator;

import java.util.List;

public interface IAdministratorService {
    List<Administrator> getAllAdministrators();
    Administrator login(String username, String pass);
}
