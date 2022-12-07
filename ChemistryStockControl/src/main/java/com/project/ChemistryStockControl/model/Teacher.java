package com.project.ChemistryStockControl.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Teacher")
public class Teacher extends User {
    
    public Teacher() {
        super();
    }


}
