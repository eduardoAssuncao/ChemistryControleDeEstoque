package com.project.ChemistryStockControl.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ChemistryStockControl.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByMatricula(String matricula);
}
