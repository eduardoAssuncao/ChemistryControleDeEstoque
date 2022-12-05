package com.project.ChemistryStockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ChemistryStockControl.model.Technician;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician, Long> {

}
