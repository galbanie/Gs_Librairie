/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.modele.entity;

import com.gs.classes.TypeAlerte;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
@Entity
public class Alerte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TypeAlerte type;
    @OneToOne
    @JoinColumn(name = "EMETTEUR")
    private Usager emetteur;
    /*@OneToOne
    @JoinColumn(name = "EMETTEUR")
    private Usager suivi;*/
    @Column
    private String commentaire;

    public Alerte() {
    }

    public Alerte(TypeAlerte type, Usager emetteur, String commentaire) {
        this.type = type;
        this.emetteur = emetteur;
        this.commentaire = commentaire;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeAlerte getType() {
        return type;
    }

    public void setType(TypeAlerte type) {
        this.type = type;
    }

    public Usager getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Usager emetteur) {
        this.emetteur = emetteur;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alerte)) {
            return false;
        }
        Alerte other = (Alerte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gs.modele.entity.Signal[ id=" + id + " ]";
    }
    
}
