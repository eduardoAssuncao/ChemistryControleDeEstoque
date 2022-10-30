
package com.project.ChemistryStockControl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codSector;

    private int qtdEstoque;

    @OneToOne(mappedBy = "sector")
    private Material material;

    public Sector() {
    }

    public Sector(int qtdEstoque) {
        super();
        this.qtdEstoque = qtdEstoque;
    }

    public long getCodSector() {
        return this.codSector;
    }

    public void setCodSector(long codSector) {
        this.codSector = codSector;
    }

    public int getQtdEstoque() {
        return this.qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void gerarRelatorio() {

    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

}
