/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.classes;

import com.gs.outils.StateType;

/**
 *
 * @author galbanie <galbanie at setrukmarcroger@gmail.com>
 */
public class State {
    private StateType type;
    private String message;

    public State(StateType type, String message) {
        this.type = type;
        this.message = message;
    }

    public StateType getType() {
        return type;
    }

    public void setType(StateType type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
