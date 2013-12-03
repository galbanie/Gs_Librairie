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
    STYLE_EN_CASCADE("text","text/css",".css"),
    COMMA_SEPARED_VALUE("text","text/csv",".csv"),
    HTML("text","text/html",".html"),
    PLAIN("text","text/plain",""),
    XML("text","text/xml",".xml"),
    
    /*
    * Type Image
    *
    */
    GIF("image","image/gif",".gif"),
    JPEG("image","image/jpeg",".jpeg"),
    PNG("image","image/png",".png"),
    TIFF("image","image/tiff",".tiff"),
    ICO("image","image/vnd.microsoft.icon",".ico"),
    SVG("image","image/svg+xml",".svg"),
    
    /*
    * Type Video
    *
    */
    ;

    private ContentType(String type, String mine, String extension) {
        this.type = type;
        this.mine = mine;
        this.extension = extension;
    }
    
    private final String type;
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

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }
    
    
    
    
}
