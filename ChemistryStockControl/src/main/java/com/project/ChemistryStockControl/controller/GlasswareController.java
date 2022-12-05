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
import com.project.ChemistryStockControl.model.Glassware;
import com.project.ChemistryStockControl.repository.GlasswareRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class GlasswareController {

    @Autowired
    private GlasswareRepository glasswareRepository;

    // get all glasswares
    @GetMapping("/glassware")
    public List<Glassware> getAllGlasswares() {
        return glasswareRepository.findAll();
    }

    // create glassware rest api
    @PostMapping("/glassware")
    public Glassware createGlassware(@RequestBody Glassware glassware) {
        return glasswareRepository.save(glassware);
    }

    // get glassware by id rest api
    @GetMapping("/glassware/{id}")
    public ResponseEntity<Glassware> getGlaswareById(@PathVariable Long id) {

        Glassware glassware = glasswareRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Glassware not exist with id :" + id));
        return ResponseEntity.ok(glassware);
    }

    // update glassware rest api
    @PutMapping("/glassware/{id}")
    public ResponseEntity<Glassware> updateGlassware(@PathVariable Long id, @RequestBody Glassware glasswareDetails) {

        Glassware glassware = glasswareRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Glassware not exist with id :" + id));

        glassware.setName(glasswareDetails.getName());
        glassware.setParticulars(glasswareDetails.getParticulars());

        Glassware updateGlassware = glasswareRepository.save(glassware);
        return ResponseEntity.ok(updateGlassware);
    }

    // delete glassware rest api
    @DeleteMapping("/glassware/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteGlassware(@PathVariable Long id) {
        Glassware glassware = glasswareRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Glassware not exist with id :" + id));

        glasswareRepository.delete(glassware);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
