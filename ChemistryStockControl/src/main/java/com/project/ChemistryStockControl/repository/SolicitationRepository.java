package com.project.ChemistryStockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ChemistryStockControl.model.Solicitation;

@Repository
public interface SolicitationRepository extends JpaRepository<Solicitation, Long> {

}
