/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Set;

/**
 *
 * @author wilbur
 */
public class Universe {
    
    private int numbOfGalaxies;
    private String univName;
    private Set<Galaxy> galaxies;

    public Universe() {
    }

    public int getNumbOfGalaxies() {
        return numbOfGalaxies;
    }

    public void setNumbOfGalaxies(int numbOfGalaxies) {
        this.numbOfGalaxies = numbOfGalaxies;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public Set<Galaxy> getGalaxies() {
        return galaxies;
    }

    public void setGalaxies(Set<Galaxy> galaxies) {
        this.galaxies = galaxies;
    }

    
    
    
}
