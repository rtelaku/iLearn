package com.example.ilearn.repository;

import com.example.ilearn.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AdministratorRepository extends JpaRepository<Administrator,Integer> {
    @Query("select a from Administrator a where a.username=?1 and a.password=?2")
    Optional<Administrator> findAdminByUsernameAndPassword(String username, String pass);
}
