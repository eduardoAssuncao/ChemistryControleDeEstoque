package com.project.ChemistryStockControl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ChemistryStockControl.exception.ResourceNotFoundException;
import com.project.ChemistryStockControl.model.Material;
import com.project.ChemistryStockControl.repository.MaterialRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class MaterialController {

    @Autowired
    private MaterialRepository materialRepository;

    // get all materials
    @GetMapping("/materials")
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    // create material rest api
    @PostMapping("/materials")
    public Material createMaterial(@RequestBody Material material) {
        return materialRepository.save(material);
    }

    // get material by id rest api
    @GetMapping("/materials/{id}")
    public ResponseEntity<Material> getMaterialById(@PathVariable Long id) {

        Material material = materialRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Material not exist with id :" + id));
        return ResponseEntity.ok(material);
    }

    // update material rest api
    @PutMapping("/materials/{id}")
    public ResponseEntity<Material> updateMaterial(@PathVariable Long id, @RequestBody Material materialDetails) {

        Material material = materialRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Material not exist with id :" + id));

        material.setName(materialDetails.getName());
        material.setParticulars(materialDetails.getParticulars());

        Material updateMaterial = materialRepository.save(material);
        return ResponseEntity.ok(updateMaterial);
    }

    // delete material rest api
    @DeleteMapping("/materials/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteMaterial(@PathVariable Long id) {
        Material material = materialRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Material not exist with id :" + id));

        materialRepository.delete(material);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
