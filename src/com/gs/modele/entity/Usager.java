package com.gs.modele.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
@Entity
@Table(name = "USAGER")
@NamedQueries({
        @NamedQuery(name = "Usager.findAll", query = "SELECT u FROM Usager u"),
        @NamedQuery(name = "Usager.findByIdentifiant", query = "SELECT u FROM Usager u WHERE u.identifiant = :identifiant"),
        @NamedQuery(name = "Usager.findByEmail", query = "SELECT u FROM Usager u WHERE u.email = :email")
})
@Inheritance(strategy = InheritanceType.JOINED)
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

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usager)) {
            return false;
        }
        Usager other = (Usager) object;
        if((this.identifiant == null && other.identifiant != null) || (this.identifiant != null && !this.identifiant.equals(other.identifiant))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.identifiant);
        hash = 61 * hash + Objects.hashCode(this.nom);
        hash = 61 * hash + Objects.hashCode(this.prenom);
        hash = 61 * hash + Objects.hashCode(this.email);
        hash = 61 * hash + Objects.hashCode(this.password);
        return hash;
    }
    
    

    
}
