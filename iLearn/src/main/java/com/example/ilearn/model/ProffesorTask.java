package com.example.ilearn.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class ProffesorTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskCode;
    @Column
    private String taskName;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="professor")
    private Professor professor;

    public ProffesorTask(int taskCode, String taskName) {
        this.taskCode = taskCode;
        this.taskName = taskName;
    }

    public ProffesorTask() {
    }

    public int getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(int taskCode) {
        this.taskCode = taskCode;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}