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
import com.project.ChemistryStockControl.model.Reagent;
import com.project.ChemistryStockControl.repository.ReagentRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class ReagentController {

    @Autowired
    private ReagentRepository reagentRepository;

    // get all reagents
    @GetMapping("/reagents")
    public List<Reagent> getAllReagents() {
        return reagentRepository.findAll();
    }

    // create reagent rest api
    @PostMapping("/reagents")
    public Reagent createReagent(@RequestBody Reagent reagent) {
        return reagentRepository.save(reagent);
    }

    // get reagent by id rest api
    @GetMapping("/reagents/{id}")
    public ResponseEntity<Reagent> getReagentById(@PathVariable Long id) {

        Reagent reagent = reagentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reagent not exist with id :" + id));
        return ResponseEntity.ok(reagent);
    }

    // update reagent rest api
    @PutMapping("/reagents/{id}")
    public ResponseEntity<Reagent> updateReagent(@PathVariable Long id, @RequestBody Reagent reagentDetails) {

        Reagent reagent = reagentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reagent not exist with id :" + id));

        reagent.setName(reagentDetails.getName());
        reagent.setParticulars(reagentDetails.getParticulars());

        Reagent updateReagent = reagentRepository.save(reagent);
        return ResponseEntity.ok(updateReagent);
    }

    // delete reagent rest api
    @DeleteMapping("/reagents/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteReagent(@PathVariable Long id) {
        Reagent reagent = reagentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reagent not exist with id :" + id));

        reagentRepository.delete(reagent);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
