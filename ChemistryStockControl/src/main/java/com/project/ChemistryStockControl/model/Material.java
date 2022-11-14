package com.project.ChemistryStockControl.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "materials")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 50, discriminatorType = DiscriminatorType.STRING)
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codMaterial;

    @Column(name = "name")
    private String name;

    @Column(name="brand")
    private String brand;

    @Column(name = "particulars")
    private String particulars;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    private Sector sector;

    @ManyToMany
    private List<Solicitation> solicitations;

    public Material() {
    }

    public Material(String name, String brand, String particulars, int quantity, Sector sector) {
        super();
        this.name = name;
        this.brand = brand;
        this.particulars = particulars;
        this.quantity = quantity;
        this.sector = sector;
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

    public Sector getSector() {
        return this.sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public List<Solicitation> getSolicitations() {
        return this.solicitations;
    }

    public void setSolicitations(List<Solicitation> solicitations) {
        this.solicitations = solicitations;
    }

}
