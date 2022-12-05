
package com.project.ChemistryStockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ChemistryStockControl.model.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {

}
