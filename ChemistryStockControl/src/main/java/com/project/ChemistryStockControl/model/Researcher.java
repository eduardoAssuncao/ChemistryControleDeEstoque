package com.project.ChemistryStockControl.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Researcher")
public class Researcher extends User {
    public Researcher() {
        super();
    }
}
