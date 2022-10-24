package com.project.ChemistryStockControl.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;

@Entity
public class Solicitation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codSolicitacao;

    private String matriculaSolicitante;

    private Sector setor;

    // @ManyToMany
    // private MaterialSolicitado materiais;

    private Date dataSolicitacao;

    public Solicitation() {

    }

    public Solicitation(String matriculaSolicitante, Sector setor, Date dataSolicitacao) {
        super();
        this.matriculaSolicitante = matriculaSolicitante;
        this.setor = setor;
        this.dataSolicitacao = dataSolicitacao;
    }

    public Long getCodSolicitacao() {
        return this.codSolicitacao;
    }

    public void setCodSolicitacao(Long codSolicitacao) {
        this.codSolicitacao = codSolicitacao;
    }

    public String getMatriculaSolicitante() {
        return this.matriculaSolicitante;
    }

    public void setMatriculaSolicitante(String matriculaSolicitante) {
        this.matriculaSolicitante = matriculaSolicitante;
    }

    public Sector getSetor() {
        return this.setor;
    }

    public void setSetor(Sector setor) {
        this.setor = setor;
    }

    public Date getDataSolicitacao() {
        return this.dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

}
