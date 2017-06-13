/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author wilbur
 */
public class Sector {
    
    //class instance variables
    private int secNumber;
    private String portName;

    public Sector() {
    }

    public int getSecNumber() {
        return secNumber;
    }

    public void setSecNumber(int secNumber) {
        this.secNumber = secNumber;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }
    
    
}
