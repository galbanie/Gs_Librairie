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
public class Text extends Contenu{
    private String text;

    /**
     *
     */
    public Text() {
    }

    /**
     *
     * @param text
     */
    public Text(String text) {
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
