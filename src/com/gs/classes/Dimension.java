/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.classes;

import com.gs.outils.Unite;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
@Embeddable
public class Dimension implements Serializable {
    
    private int largeur;
    
    private int hauteur;
    
    @Enumerated(EnumType.STRING)
    private Unite unite;

    public Dimension() {
        this(0,0);
    }

    public Dimension(int largeur, int hauteur) {
        this(largeur,hauteur,Unite.PIXEL);
    }
    
    public Dimension(int largeur, int hauteur, Unite unite) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.unite = unite;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }
    
    
}
