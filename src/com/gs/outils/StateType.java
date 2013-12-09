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
public enum StateType {
    
    HIGTLIGHT("ui-state-highlight"),
    ERROR("ui-state-error");

    private StateType(String ui) {
        this.ui = ui;
    }
    
    private final String ui;
}
