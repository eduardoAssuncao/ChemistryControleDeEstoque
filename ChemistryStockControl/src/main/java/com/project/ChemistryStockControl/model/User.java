package com.project.ChemistryStockControl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @Column(name = "matricula")
<<<<<<< HEAD
    private Long matricula;

    @Column(name = "name")
=======
    private String matricula;

    @Column(name = "nome")
>>>>>>> b5c4592 (change model,repository,controll user and mainJS)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    public User() {
    }

<<<<<<< HEAD
    public User(Long matricula, String name, String email, String senha) {
=======
    public User(String matricula, String name, String email, String senha) {
>>>>>>> b5c4592 (change model,repository,controll user and mainJS)
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

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public void visualizarSolicitacoes() {

    }

    public void procurarMateriais() {

    }

}
