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
import com.project.ChemistryStockControl.model.Researcher;
import com.project.ChemistryStockControl.repository.ResearcherRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class ResearcherController {

    @Autowired
    private ResearcherRepository researcherRepository;

    @GetMapping("/researcher")
    public List<Researcher> getAllResearchers() {
        return researcherRepository.findAll();
    }

    @PostMapping("/researcher")
    public Researcher createResearcher(@RequestBody Researcher researcher) {
        return researcherRepository.save(researcher);
    }

    @GetMapping("/researcher/{id}")
    public ResponseEntity<Researcher> getResearcherById(@PathVariable Long id) {

        Researcher researcher = researcherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reseacher not exist with id :" + id));
        return ResponseEntity.ok(researcher);
    }

    @PutMapping("/researcher/{id}")
    public ResponseEntity<Researcher> updateResearcher(@PathVariable Long id,
            @RequestBody Researcher reseacherDetails) {

        Researcher researcher = researcherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Researcher not exist with id :" + id));
        researcher.setEmail(reseacherDetails.getEmail());
        researcher.setName(reseacherDetails.getName());
        researcher.setSenha(reseacherDetails.getSenha());

        Researcher updateResearcher = researcherRepository.save(researcher);
        return ResponseEntity.ok(updateResearcher);
    }

    @DeleteMapping("/researcher/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteReseacher(@PathVariable Long id) {
        Researcher researcher = researcherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reseacher not exist with id :" + id));

        researcherRepository.delete(researcher);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
