package com.example.ilearn.helper;


import java.io.Serializable;


//kjo klase na sherben per me i marr te dhenat nga login
public class LoginHelper implements Serializable { // te dhenat kur na vijne prej frontit na vijne JSON
    // keshtu qe i mappojme ne LoginHelper
    private String username;
    private String password;

    public LoginHelper (String username, String password) {
        this.username = username;
        this.password = password;
    }
    //ajax na ndihmon me bo http requests
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
