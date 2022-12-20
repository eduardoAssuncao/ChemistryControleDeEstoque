
package com.project.ChemistryStockControl.model;

import java.sql.Date;
//import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Solicitation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codSolicitacao;

    private String nome;

    private int estoque;

    private String finalidade;

    private float quantidade;

    private Date retirada;

    private Date devolucao;

    private String justificativa;

    private String destino;

    // @ManyToOne
    // private User user;

    @ManyToOne
    @JoinColumn(name = "User_id") // verificar se o relacionamento está correto
    User user;

    @ManyToMany
    private List<Material> materials;

    public Solicitation() {

    }

    public Solicitation(String nome, int estoque, String finalidade, float quantidade, Date retirada, Date devolucao,
            String justificativa, String destino, User user, List<Material> materials) {
        super();
        this.nome = nome;
        this.estoque = estoque;
        this.finalidade = finalidade;
        this.quantidade = quantidade;
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.justificativa = justificativa;
        this.destino = destino;
        this.user = user;
        this.materials = materials;
    }

    public Long getCodSolicitacao() {
        return this.codSolicitacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getFinalidade() {
        return this.finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public float getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Date getRetirada() {
        return this.retirada;
    }

    public void setRetirada(Date retirada) {
        this.retirada = retirada;
    }

    public Date getDevolucao() {
        return this.devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
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
}
