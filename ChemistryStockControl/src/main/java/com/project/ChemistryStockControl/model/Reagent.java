package com.project.ChemistryStockControl.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Reagent extends Material {

    @Column(name = "validity")
    private Date validity;

    @Column(name = "controlled")
    private boolean controlled;

    public Reagent() {

    }

    public Reagent(Date validity, boolean controlled) {
        super();
        this.validity = validity;
        this.controlled = controlled;
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
