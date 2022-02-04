package com.example.ilearn.controller;


import com.example.ilearn.helper.GeneralResponse;
import com.example.ilearn.model.Materials;
import com.example.ilearn.service.MaterialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/materials")

public class MaterialsController {

    @Autowired
    private MaterialsService materialsService;

    @GetMapping("/{materialID}")
    public GeneralResponse<Materials> getMaterials(@PathVariable int materialID){
        Materials materials = materialsService.getMaterialsByID(materialID);
        if(materials==null){
            return new GeneralResponse.GeneralResponseBuilder(401).setError("Exception on something").build();
        }
        return new GeneralResponse.GeneralResponseBuilder<>(201).setMessage("succefullyDone").setData(materials).build();

    }

    @GetMapping("/mid/{materialID}/materialname/{mlname}")
    public GeneralResponse<Materials> getMaterials(@PathVariable int materialID,@PathVariable String name){
        Materials m=materialsService.getMaterialsByIDAndName(materialID,name);
        if(m==null){
            return new GeneralResponse.GeneralResponseBuilder(401).setError("Exception on something").build();
        }
        return new GeneralResponse.GeneralResponseBuilder<>(201).setMessage("succefullyDone").setData(m).build();
    }
}

