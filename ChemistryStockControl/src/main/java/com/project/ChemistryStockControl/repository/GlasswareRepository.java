package com.project.ChemistryStockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ChemistryStockControl.model.Glassware;

@Repository
public interface GlasswareRepository extends JpaRepository<Glassware, Long> {

}
