package com.project.ChemistryStockControl.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Requester extends User {

    @OneToMany(targetEntity = Solicitation.class)
    private List solicitationList;

    public List getSolicitationList() {
        return this.solicitationList;
    }

    public void setSolicitationList(List solicitationList) {
        this.solicitationList = solicitationList;
    }

    public void realizarSolicitacao(/* Solicitação */) {

    }

    public void gerarFispq() {

    }
}
