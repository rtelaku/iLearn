package com.example.ilearn.model;


import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "UserID")
public class User extends Student {


    private String gradaAkademike;



    public User() {
    }

    public User(UserBuilder userBuilder) {
        super(userBuilder.studentName,userBuilder.studentLastName,userBuilder.dateOfBirth, userBuilder.email, userBuilder.numriPersonal, userBuilder.username,userBuilder.password,userBuilder.drejtimi,userBuilder.roli);
        this.gradaAkademike=userBuilder.gradaAkademike;

    }


    public String getGradaAkademike() {
        return gradaAkademike;
    }

    public void setGradaAkademike(String gradaAkademike) {
        this.gradaAkademike = gradaAkademike;
    }
    public Student getStudent() {
        return student;
    }

    public void setManager(Student student) {
        this.student = student;
    }

    //BuilderPattern
    @ManyToOne
    private Student student;
    public static class UserBuilder{


        private String studentName;
        private String studentLastName;
        private LocalDate dateOfBirth;
        private String email;
        private String numriPersonal;
        private String username;
        private String password;
        private String drejtimi;
        private int roli;
        private String gradaAkademike;

        public UserBuilder(String studentName, String studentLastName, LocalDate dateOfBirth, String email, String numriPersonal, String username, String password, String drejtimi,int roli) {
            this.studentName = studentName;
            this.studentLastName = studentLastName;
            this.dateOfBirth = dateOfBirth;
            this.email = email;
            this.numriPersonal = numriPersonal;
            this.username = username;
            this.password = password;
            this.drejtimi = drejtimi;
            this.roli = roli;

        }

        public UserBuilder(String studentName, String studentLastName, LocalDate dateOfBirth, String email, String numriPersonal, String username, String password, String drejtimi,String gradaAkademike) {
            this.studentName = studentName;
            this.studentLastName = studentLastName;
            this.dateOfBirth = dateOfBirth;
            this.email = email;
            this.numriPersonal = numriPersonal;
            this.username = username;
            this.password = password;
            this.drejtimi = drejtimi;
            this.gradaAkademike = gradaAkademike;

        }

        public UserBuilder setGradaAkademike(String gradaAkademike) {
            this.gradaAkademike = gradaAkademike;
            return this;
        }


        public User build(){
            return new User(this);
        }
    }
}
