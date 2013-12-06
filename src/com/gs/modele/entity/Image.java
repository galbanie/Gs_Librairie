/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.modele.entity;

import com.gs.classes.Dimension;
import com.gs.exceptions.ContentTypeInvalide;
import com.gs.outils.ContentType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Image extends Media{
    @Embedded
    private Dimension dimention;
    
    @Lob
    @Column(length=100000, nullable = false)
    private byte[] imageFile;

    public Image() {
    }

    public Image(String nom, ContentType type,byte[] imageFile ) throws ContentTypeInvalide{
        this(nom,"",null,type,imageFile);
    }
    
    public Image(String nom, String description,Dimension dimention, ContentType type,byte[] imageFile ) throws ContentTypeInvalide {
        this.nom = nom;
        this.description = description;
        this.dimention = dimention;
        if(!type.getType().equals("image")) throw new ContentTypeInvalide();
        this.imageFile = imageFile;
    }

    public Dimension getDimention() {
        return dimention;
    }

    public void setDimention(Dimension dimention) {
        this.dimention = dimention;
    }

    public byte[] getImageFile() {
        return imageFile;
    }

    public void setImageFile(byte[] imageFile) {
        this.imageFile = imageFile;
    }
}
