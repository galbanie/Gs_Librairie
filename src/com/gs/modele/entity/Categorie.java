/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.modele.entity;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
public class Categorie extends Entite{
    
    private String nom;
    private String description;
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
    
    
    
}
