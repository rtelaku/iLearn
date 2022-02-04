package com.example.ilearn.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Materials {

    @Id
    @Column(name = "MID")
    private int materialID ;
    @Column(name ="Mname")
    private String materialName;
    //@Column(name = "Materials")

    public Materials() {
    }

    public Materials(int materialID, String materialName) {
        this.materialID = materialID;
        this.materialName = materialName;
    }

    public int getMaterialID() {
        return materialID;
    }

    public void setMaterialID(int materialID) {
        this.materialID = materialID;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
}
