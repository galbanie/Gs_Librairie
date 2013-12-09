/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.modele.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c"),
        @NamedQuery(name = "Categorie.findByNom", query = "SELECT c FROM Categorie c WHERE c.nom = :nom"),
        @NamedQuery(name = "Categorie.findByNomParent", query = "SELECT c FROM Categorie c WHERE c.parent.nom = :nom")
})
public class Categorie implements Serializable{
    @Id
    private String nom;
    @Column
    private String description;
    @OneToOne
    @JoinColumn
    private Categorie parent;

    public Categorie() {
        parent = null;
    }

    public Categorie(String nom, String description, Categorie parent) {
        this.nom = nom;
        this.description = description;
        this.setParent(parent);
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public Categorie getParent() {
        return parent;
    }

    /**
     *
     * @param parent
     */
    public void setParent(Categorie parent) {
        this.parent = (parent != this.parent)? parent : this.parent;
    }

    @Override
    public boolean equals(Object obj) {
        Categorie cat = (Categorie) obj;
        return this.nom.equals(cat.nom);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nom);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.parent);
        return hash;
    }
    
}
