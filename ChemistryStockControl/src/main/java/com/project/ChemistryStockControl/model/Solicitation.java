
package com.project.ChemistryStockControl.model;

import java.time.LocalDate;
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

    @ManyToOne
    private User requester;

    @ManyToMany
    private List<Material> materials;

    private LocalDate dataSolicitacao;

    private LocalDate dataDevolucao;

    private boolean devolvido = false;

    public Solicitation() {

    }

    public Solicitation(LocalDate dataSolicitacao, LocalDate dataDevolucao, Boolean devolvido) {
        super();
        this.dataSolicitacao = LocalDate.now();
        this.dataDevolucao = dataDevolucao;
        this.devolvido = devolvido;
    }

    public Long getCodSolicitacao() {
        return this.codSolicitacao;
    }

    public LocalDate getDataDevolucao() {
        return this.dataDevolucao;
    }

    public LocalDate getDataSolicitacao() {
        return this.dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public User getRequester() {
        return this.requester;
    }

    public void setRequester(User requester) {
        this.requester = requester;
    }

    public List<Material> getMaterials() {
        return this.materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public void setCodSolicitacao(Long codSolicitacao) {
        this.codSolicitacao = codSolicitacao;
    }

    public boolean isDevolvido() {
        return this.devolvido;
    }

    public boolean getDevolvido() {
        return this.devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

}
