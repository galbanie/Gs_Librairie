/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.modele.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
@Entity
public class Article implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String titre;
    @OneToMany
    @JoinTable(name = "CONTENUS_ARTICLE")
    private List<Contenu> contenus;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar publication;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar modification;
    @OneToMany
    @JoinTable(name = "COMMENTAIRES")
    private List<Commentaire> commentaires;

    public Article() {
        this("Sans Titre");
    }

    public Article(String titre) {
        this.titre = titre;
        contenus = new LinkedList<>();
        commentaires = new LinkedList<>();
    }
    
    /**
     *
     * @return
     */
    public String getTitre() {
        return titre;
    }

    /**
     *
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     *
     * @return
     */
    public List<Contenu> getContenus() {
        return contenus;
    }

    /**
     *
     * @param contenus
     */
    public void setContenus(List<Contenu> contenus) {
        this.contenus = contenus;
    }

    /**
     *
     * @return
     */
    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    /**
     *
     * @param commentaires
     */
    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    /**
     *
     * @return
     */
    public Calendar getModification() {
        return modification;
    }

    /**
     *
     * @return
     */
    public Calendar getPublication() {
        return publication;
    }

    public Long getId() {
        return id;
    }
    
    
}
