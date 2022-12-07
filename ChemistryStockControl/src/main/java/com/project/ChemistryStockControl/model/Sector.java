package com.project.ChemistryStockControl.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codSector;

    // adicionar variável nome para setor
    // private String nomeSetor; - inserir

    // OneToOne
    // private List<User> responsavel; - inserir

    // private int qtdEstoque; - remover

    @OneToMany(mappedBy = "sector", cascade = CascadeType.ALL)
    private List<Material> material;

    /*
     * @OneToMany(mappedBy = "setor", cascade = CascadeType.ALL)
     * private List<User> users;
     */

    public Sector() {
    }

    public Sector(int qtdEstoque) {
        super();
        // this.qtdEstoque = qtdEstoque;
    }

    public long getCodSector() {
        return this.codSector;
    }

    public void setCodSector(long codSector) {
        this.codSector = codSector;
    }

    // public int getQtdEstoque() {
    // return this.qtdEstoque;
    // }

    // public void setQtdEstoque(int qtdEstoque) {
    // this.qtdEstoque = qtdEstoque;
    // }

    public void gerarRelatorio() {

    }

    public List<Material> getMaterial() {
        return this.material;
    }

    public void setMaterial(List<Material> material) {
        this.material = material;
    }

    // public List<User> getUsers() {
    // return this.users;
    // }

    // public void setUsers(List<User> users) {
    // this.users = users;
    // }

}
