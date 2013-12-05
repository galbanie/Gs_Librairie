/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.modele.entity;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
@Entity
@Table(name = "ARTICLE")
public class Article extends Entite{
    @Column
    private String titre;
    @Column
    @OneToMany
    private LinkedTransferQueue<Contenu> contenus;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar publication;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar modification;
    @OneToMany
    @JoinTable(name = "ID_ARTICLE")
    private List<Commentaire> commentaires;

    public Article() {
        this("Sans Titre");
    }

    public Article(String titre) {
        this.titre = titre;
        contenus = new LinkedTransferQueue<>();
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
    public LinkedTransferQueue<Contenu> getContenus() {
        return contenus;
    }

    /**
     *
     * @param contenus
     */
    public void setContenus(List<Contenu> contenus) {
        this.contenus = (LinkedTransferQueue<Contenu>) contenus;
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
    
    
    
}
