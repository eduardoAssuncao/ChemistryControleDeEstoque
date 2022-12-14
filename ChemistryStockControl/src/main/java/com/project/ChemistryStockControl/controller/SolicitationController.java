package com.project.ChemistryStockControl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ChemistryStockControl.exception.ResourceNotFoundException;
import com.project.ChemistryStockControl.model.Solicitation;
import com.project.ChemistryStockControl.repository.SolicitationRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class SolicitationController {

    @Autowired
    private SolicitationRepository solicitationRepository;

    // get all solicitations
    @GetMapping("/solicitations")
    public List<Solicitation> getAllSolicitations() {
        return solicitationRepository.findAll();
    }

    // create solicitation rest api
    @PostMapping("/solicitations")
    public Solicitation createSolicitation(@RequestBody Solicitation solicitation) {
        return solicitationRepository.save(solicitation);
    }

    // get solicitation by id rest api
    @GetMapping("/solicitations/{id}")
    public ResponseEntity<Solicitation> getSolicitationById(@PathVariable Long id) {

        Solicitation solicitation = solicitationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Solicitation not exist with id :" + id));
        return ResponseEntity.ok(solicitation);
    }

    // update solicitaions resp api
    @PutMapping("/solicitations/{id}")
    public ResponseEntity<Solicitation> updateSolicitation(@PathVariable Long id,
            @RequestBody Solicitation solicitationDetails) {

        Solicitation solicitation = solicitationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Solicitation not exist with id :" + id));

        solicitation.setDestino(solicitationDetails.getDestino());
        solicitation.setDevolucao(solicitationDetails.getDevolucao());
        solicitation.setEstoque(solicitationDetails.getEstoque());
        solicitation.setFinalidade(solicitationDetails.getFinalidade());
        solicitation.setJustificativa(solicitationDetails.getJustificativa());
        solicitation.setMaterials(solicitationDetails.getMaterials());
        solicitation.setNome(solicitationDetails.getNome());
        solicitation.setQuantidade(solicitationDetails.getQuantidade());
        solicitation.setRetirada(solicitationDetails.getRetirada());

        Solicitation updateSolicitation = solicitationRepository.save(solicitation);
        return ResponseEntity.ok(updateSolicitation);
    }

    public ResponseEntity<Map<String, Boolean>> deleteSolicitation(@PathVariable Long id) {

        Solicitation solicitation = solicitationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Solicitation not exist with id :" + id));

        solicitationRepository.delete(solicitation);
        Map<String, Boolean> response = new HashMap<>();
        return ResponseEntity.ok(response);
    }
}
