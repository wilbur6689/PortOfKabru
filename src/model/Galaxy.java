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
public class Galaxy {
    private Set<Quadrant> quadrants;

    public Galaxy() {
    }

    public Set<Quadrant> getQuadrants() {
        return quadrants;
    }

    public void setQuadrants(Set<Quadrant> quadrants) {
        this.quadrants = quadrants;
    }

     
    
    
}
