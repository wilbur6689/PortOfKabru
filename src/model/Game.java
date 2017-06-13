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
public class Game implements Serializable {
    private String main;
    private Ship ship;
    private boolean endOfGame = false;
    
    public Game() {
        
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public boolean isEndOfGame() {
        return endOfGame;
    }

    public void setEndOfGame(boolean endOfGame) {
        this.endOfGame = endOfGame;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.main);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.main, other.main)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "main=" + main + ", ship=" + ship + ", endOfGame=" + endOfGame + '}';
    }
    
    
    
}
