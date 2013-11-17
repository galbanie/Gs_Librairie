/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.outils;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
public enum ContentType {

    /*
    * Type Texte
    *
    */
    STYLE_EN_CASCADE("text/css",".css"),
    COMMA_SEPARED_VALUE("text/csv",".csv"),
    HTML("text/html",".html"),
    PLAIN("text/plain",""),
    XML("text/xml",".xml"),
    
    /*
    * Type Image
    *
    */
    GIF("image/gif",".gif"),
    JPEG("image/jpeg",".jpeg"),
    PNG("image/png",".png"),
    TIFF("image/tiff",".tiff"),
    ICO("image/vnd.microsoft.icon",".ico"),
    SVG("image/svg+xml",".svg"),
    
    /*
    * Type Video
    *
    */
    ;

    private ContentType(String mine, String extension) {
        this.mine = mine;
        this.extension = extension;
    }
    
    private final String mine;
    private final String extension;

    /**
     *
     * @return
     */
    public String getExtension() {
        return extension;
    }

    /**
     *
     * @return
     */
    public String getMine() {
        return mine;
    }
    
    
}
