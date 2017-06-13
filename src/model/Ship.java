/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author wilbur
 */
public class Ship implements Serializable {
    
    //class instance variables
    private String currentSec;
    private String prevSec;
    private int maxHealth;
    private int currentHealth;
    private int maxShields;
    private int currentShields;
    private int shipSpeed;
    private int warpDist;
    private int cargoBays;

    public Ship() {
    }

    public Ship(String currentSec, String prevSec, int maxHealth, int currentHealth, int maxShields, int currentShields, int shipSpeed, int warpDist, int cargoBays) {
        this.currentSec = currentSec;
        this.prevSec = prevSec;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.maxShields = maxShields;
        this.currentShields = currentShields;
        this.shipSpeed = shipSpeed;
        this.warpDist = warpDist;
        this.cargoBays = cargoBays;
    }

    
    public String getCurrentSec() {
        return currentSec;
    }

    public void setCurrentSec(String currentSec) {
        this.currentSec = currentSec;
    }

    public String getPrevSec() {
        return prevSec;
    }

    public void setPrevSec(String prevSec) {
        this.prevSec = prevSec;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxShields() {
        return maxShields;
    }

    public void setMaxShields(int maxShields) {
        this.maxShields = maxShields;
    }

    public int getCurrentShields() {
        return currentShields;
    }

    public void setCurrentShields(int currentShields) {
        this.currentShields = currentShields;
    }

    public int getShipSpeed() {
        return shipSpeed;
    }

    public void setShipSpeed(int shipSpeed) {
        this.shipSpeed = shipSpeed;
    }

    public int getWarpDist() {
        return warpDist;
    }

    public void setWarpDist(int warpDist) {
        this.warpDist = warpDist;
    }

    public int getCargoBays() {
        return cargoBays;
    }

    public void setCargoBays(int cargoBays) {
        this.cargoBays = cargoBays;
    }

    @Override
    public String toString() {
        return "Ship{" + "currentSec=" + currentSec + ", prevSec=" + prevSec + ", maxHealth=" + maxHealth + ", currentHealth=" + currentHealth + ", maxShields=" + maxShields + ", currentShields=" + currentShields + ", shipSpeed=" + shipSpeed + ", warpDist=" + warpDist + ", cargoBays=" + cargoBays + '}';
    }
    
    

    
    
    

   
    
    
}
