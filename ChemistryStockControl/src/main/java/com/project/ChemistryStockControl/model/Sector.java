package com.project.ChemistryStockControl.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codSector;

    @Column(name = "nomeSetor")
    private String nomeSetor;

    @OneToOne
    private User responsavel;

    @OneToMany(mappedBy = "sector", cascade = CascadeType.ALL)
    private List<Material> material;

    public Sector() {
    }

    public Sector(String nomeSetor, User reponsavel) {
        super();
        this.nomeSetor = nomeSetor;
        this.responsavel = reponsavel;
    }

    public long getCodSector() {
        return this.codSector;
    }

    public void setCodSector(long codSector) {
        this.codSector = codSector;
    }

    public List<Material> getMaterial() {
        return this.material;
    }

    public void setMaterial(List<Material> material) {
        this.material = material;
    }

    public String getNomeSetor() {
        return this.nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public User getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(User responsavel) {
        this.responsavel = responsavel;
    }

    public void gerarRelatorio() {

    }
}
