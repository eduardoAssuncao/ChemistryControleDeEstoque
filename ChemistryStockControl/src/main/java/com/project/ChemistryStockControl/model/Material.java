package com.project.ChemistryStockControl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materials")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codMaterial;

    @Column(name = "name")
    private String name;

    @Column(name = "particulars")
    private String particulars;

    public Material() {
    }

    public Material(String name, String particulars) {
        super();
        this.name = name;
        this.particulars = particulars;
    }

    public long getCodMaterial() {
        return this.codMaterial;
    }

    public void setCodMaterial(long codMaterial) {
        this.codMaterial = codMaterial;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParticulars() {
        return this.particulars;
    }

    public void setParticulars(String particulars) {
        this.particulars = particulars;
    }

}
