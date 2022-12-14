package com.project.ChemistryStockControl.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;

import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 50, discriminatorType = DiscriminatorType.STRING)
public class User {

    @Id
    @Column(name = "matricula")
    private String matricula;

    @Column(name = "nome")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @OneToMany(targetEntity = Solicitation.class)
    private List solicitationlist;

    public User() {
    }

    public User(String matricula, String name, String email, String senha) {
        super();
        this.matricula = matricula;
        this.name = name;
        this.email = email;
        this.senha = senha;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List getSolicitationlist() {
        return this.solicitationlist;
    }

    public void setSolicitationlist(List solicitationlist) {
        this.solicitationlist = solicitationlist;
    }

    public void visualizarSolicitacoes() {

    }

    public void procurarMateriais() {

    }

}
