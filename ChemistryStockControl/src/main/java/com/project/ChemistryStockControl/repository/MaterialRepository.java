package com.project.ChemistryStockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ChemistryStockControl.model.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {

}
