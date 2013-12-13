/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.modele.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
@Entity
//@DiscriminatorValue("TEXTE")
public class Texte extends Contenu{
    @Lob
    @Column(length = 2100)
    private String text;

    /**
     *
     */
    public Texte() {
    }

    /**
     *
     * @param text
     */
    public Texte(String text) {
        this.text = text;
    }

    /**
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     */
    public String getText() {
        return text;
    }
    
    
}
