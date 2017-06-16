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
    private String secName;
    private String portName;
    private int secCon1; //this is the first connection 
    private int secCon2;
    private int secCon3;

    public Sector() {
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public int getSecCon1() {
        return secCon1;
    }

    public void setSecCon1(int secCon1) {
        this.secCon1 = secCon1;
    }

    public int getSecCon2() {
        return secCon2;
    }

    public void setSecCon2(int secCon2) {
        this.secCon2 = secCon2;
    }

    public int getSecCon3() {
        return secCon3;
    }

    public void setSecCon3(int secCon3) {
        this.secCon3 = secCon3;
    }

    

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }
    
    
}
