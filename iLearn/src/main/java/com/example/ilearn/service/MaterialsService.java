package com.example.ilearn.service;


import com.example.ilearn.model.Materials;
import com.example.ilearn.repository.MaterialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialsService implements IMaterialsService{
    @Autowired
    public MaterialsRepository materialsRepository;

    @Override
    public List<Materials> getAllMaterials() {
        return this.materialsRepository.findAll();
    }

    public Materials getMaterialsByID(int materialID){
        Optional<Materials> materialsOptional = materialsRepository.findById(materialID);
        if(materialsOptional == null)
            return null;

        return materialsOptional.get();
    }
    public Materials getMaterialsByIDAndName(int materialID,String materialName){
        Materials materials =materialsRepository.findByMaterialsIDAndMaterialsName(materialID,materialName);
        return materials;
    }
}
