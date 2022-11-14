package com.project.ChemistryStockControl.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Reagente")
public class Reagent extends Material {

    @Column(name = "validity")
    private Date validity;

    @Column(name = "controlled")
    private boolean controlled;

    @Column(name = "quantLeft")
    private int quantLeft;
    
    public Reagent() {

    }

    public Reagent(Date validity, boolean controlled, int qtdLeft) {
        super();
        this.validity = validity;
        this.controlled = controlled;
        this.quantLeft = qtdLeft;
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

}
