package com.project.ChemistryStockControl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "glasswares")
public class Glassware extends Material {

    @Column(name = "capacity")
    private String capacity;

    public Glassware() {

    }

    public Glassware(String capacity) {
        super();
        this.capacity = capacity;
    }

    public String getCapacity() {
        return this.capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}
