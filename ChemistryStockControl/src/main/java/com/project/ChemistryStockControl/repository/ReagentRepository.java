package com.project.ChemistryStockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ChemistryStockControl.model.Reagent;

@Repository
public interface ReagentRepository extends JpaRepository<Reagent, Long> {

}
