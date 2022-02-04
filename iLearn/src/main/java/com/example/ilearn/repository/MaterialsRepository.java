package com.example.ilearn.repository;


import com.example.ilearn.model.Materials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialsRepository extends JpaRepository<Materials,Integer> {
    @Query("select m from Materials m where m.materialID=?1 and m.materialName=?2")
    Materials findByMaterialsIDAndMaterialsName(int materialID, String materialName);
}
