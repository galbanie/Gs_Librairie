/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.modele.entity;

import javax.persistence.Entity;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
@Entity
public class Administrateur extends Moderateur{

    public Administrateur() {
        super();
    }

    public Administrateur(String identifiant, String email, String password) {
        super(identifiant, email, password);
    }
    
}
