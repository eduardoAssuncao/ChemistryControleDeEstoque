
package com.project.ChemistryStockControl.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Requester extends User {

   @OneToMany
   private List<Solicitation> solicitations;

   public List<Solicitation> getSolicitations() {
      return this.solicitations;
   }

   public void setSolicitations(List<Solicitation> solicitations) {
      this.solicitations = solicitations;
   }

   public void realizarSolicitacao() {

   }

   public void gerarFispq() {

   }
}
