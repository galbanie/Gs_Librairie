package com.gs.modele.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
@Entity
@Table(name = "USAGER")
public class Usager implements Serializable{
     
     @Id
     private String identifiant;
     @Column
     private String nom;
     @Column
     private String prenom;
     @Column(unique = true)
     private String email;
     @Column
     private String password;

    public Usager() {
    }

    public Usager(String identifiant, String nom, String prenom, String email, String password) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
    }
     
     

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Get the value of prenom
     *
     * @return the value of prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Set the value of prenom
     *
     * @param prenom new value of prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    /**
     * Get the value of nom
     *
     * @return the value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the value of nom
     *
     * @param nom new value of nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }


    /**
     * Get the value of identifiant
     *
     * @return the value of identifiant
     */
    public String getIdentifiant() {
        return identifiant;
    }

    /**
     * Set the value of identifiant
     *
     * @param identifiant new value of identifiant
     */
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    
}
