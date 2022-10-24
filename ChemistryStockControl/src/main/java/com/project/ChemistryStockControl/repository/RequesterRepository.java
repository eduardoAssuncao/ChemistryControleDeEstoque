package com.project.ChemistryStockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ChemistryStockControl.model.Requester;

@Repository
public interface RequesterRepository extends JpaRepository<Requester, Long> {

}
