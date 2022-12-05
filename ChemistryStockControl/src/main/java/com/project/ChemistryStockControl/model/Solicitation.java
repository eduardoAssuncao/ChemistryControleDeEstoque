
package com.project.ChemistryStockControl.model;

import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Solicitation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codSolicitacao;

    private String matriculaSolicitante;

    // private Sector sector;

    @ManyToOne
    private Requester requester;

    @ManyToMany
    private List<Material> materials;

    private Date dataSolicitacao;

    public Solicitation() {

    }

    public Solicitation(String matriculaSolicitante, Sector setor, Date dataSolicitacao) {
        super();
        this.matriculaSolicitante = matriculaSolicitante;
        // this.setor = setor;
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

    public Date getDataSolicitacao() {
        return this.dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Requester getRequester() {
        return this.requester;
    }

    public void setRequester(Requester requester) {
        this.requester = requester;
    }

    public List<Material> getMaterials() {
        return this.materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

}
