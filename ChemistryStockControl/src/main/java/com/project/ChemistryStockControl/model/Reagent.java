package com.project.ChemistryStockControl.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Reagente")
public class Reagent extends Material {

    private String codigo;

    @Column(name = "validity")
    private Date validity;

    @Column(name = "controlled")
    private boolean controlled;

    @Column(name = "quantLeft") // quandidade restante do frasco
    private int quantLeft;

    @Column(name = "unidade")
    private String unidade;

    @Column(name = "finalidade")
    private String finalidade; // {Estudo, Pesquisa}

    public Reagent() {

    }

    public Reagent(Date validity, boolean controlled, int qtdLeft, String unidade, String finalidade) {
        super();
        this.validity = validity;
        this.controlled = controlled;
        this.quantLeft = qtdLeft;
        this.unidade = unidade;
        this.finalidade = finalidade;
    }

    public Date getValidity() {
        return this.validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public boolean isControlled() {
        return this.controlled;
    }

    public boolean getControlled() {
        return this.controlled;
    }

    public void setControlled(boolean controlled) {
        this.controlled = controlled;
    }

    public int getQuantLeft() {
        return this.quantLeft;
    }

    public void setQuantLeft(int quantLeft) {
        this.quantLeft = quantLeft;
    }

    public String getUnidade() {
        return this.unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getFinalidade() {
        return this.finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

}
