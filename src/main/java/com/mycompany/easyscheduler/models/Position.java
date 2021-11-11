/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.easyscheduler.models;

/**
 *
 * @author matth
 */
public class Position {
    private String positionTitle;
    private int position_ID;

    public Position(String positionTitle, int position_ID) {
        this.positionTitle = positionTitle;
        this.position_ID = position_ID;
    }

    public Position() {
    }

    
    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public int getPosition_ID() {
        return position_ID;
    }

    public void setPosition_ID(int position_ID) {
        this.position_ID = position_ID;
    }
    
    
}
