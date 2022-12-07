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
import com.project.ChemistryStockControl.model.Sector;
import com.project.ChemistryStockControl.repository.SectorRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class SectorController {

    @Autowired
    private SectorRepository sectorRepository;

    @GetMapping("/sectors")
    public List<Sector> getAllSectors() {
        return sectorRepository.findAll();
    }

    @PostMapping("/sectors")
    public Sector createSector(@RequestBody Sector sector) {
        return sectorRepository.save(sector);
    }

    @GetMapping("/sectors/{id}")
    public ResponseEntity<Sector> getSectorById(@PathVariable Long id) {

        Sector sector = sectorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sector not exist with id :" + id));
        return ResponseEntity.ok(sector);
    }

    @PutMapping("/sectors/{id}")
    public ResponseEntity<Sector> updateSector(@PathVariable Long id, @RequestBody Sector sectorDetails) {

        Sector sector = sectorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sector not exist with id :" + id));

        sector.setMaterial(sectorDetails.getMaterial());
        // sector.setQtdEstoque(sectorDetails.getQtdEstoque());
        // sector.setUsers(sectorDetails.getUsers());

        Sector updateSector = sectorRepository.save(sector);
        return ResponseEntity.ok(updateSector);
    }

    @DeleteMapping("/sectors/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteSector(@PathVariable Long id) {
        Sector sector = sectorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sector not exist with id :" + id));

        sectorRepository.delete(sector);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
