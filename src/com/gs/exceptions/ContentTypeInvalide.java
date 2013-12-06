/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.exceptions;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
public class ContentTypeInvalide extends Exception {

    /**
     * Creates a new instance of <code>ContentTypeInvalide</code> without detail
     * message.
     */
    public ContentTypeInvalide() {
    }

    /**
     * Constructs an instance of <code>ContentTypeInvalide</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ContentTypeInvalide(String msg) {
        super(msg);
    }
}
