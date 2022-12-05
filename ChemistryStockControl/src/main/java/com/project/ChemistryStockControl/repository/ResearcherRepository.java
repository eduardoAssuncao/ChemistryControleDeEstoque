package com.project.ChemistryStockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ChemistryStockControl.model.Researcher;

@Repository
public interface ResearcherRepository extends JpaRepository<Researcher, Long> {

}
