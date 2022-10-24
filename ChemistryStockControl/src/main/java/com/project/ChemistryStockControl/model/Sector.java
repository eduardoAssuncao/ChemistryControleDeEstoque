package com.project.ChemistryStockControl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codSector;

    private int qtdEstoque;

    private Material listaMateriais;

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

    public Material getListaMateriais() {
        return this.listaMateriais;
    }

    public void setListaMateriais(Material listaMateriais) {
        this.listaMateriais = listaMateriais;
    }

}
