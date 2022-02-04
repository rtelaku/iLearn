package com.example.ilearn.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
public class AdministratorTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskCode;
    @Column
    private String taskName;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="administrator")
    private Administrator administrator;

    public AdministratorTask(int taskCode, String taskName) {
        this.taskCode = taskCode;
        this.taskName = taskName;
    }

    public AdministratorTask() {
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

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}
