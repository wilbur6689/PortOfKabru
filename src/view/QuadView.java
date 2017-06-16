/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.UniverseControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Galaxy;
import model.Game;
import model.Quadrant;
import model.Sector;
import model.Universe;
import portofkabru.PortOfKabru;

/**
 *
 * @author wilbur
 */
public class QuadView extends View{
    
    public QuadView() {
        super("\n   G - List number of Galaxies"
            + "\n   S - List number of Sectors"
            + "\n   L - List everything"
            + "\n   Q - Quit"
            + "\n------------------------------------------");
    }
    
    
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
   
            case "G": // warp to a new sector 
                this.listGal();
                break;
            case "S": // warp to a new sector 
                this.listSectors();
                break;
            case "L": // warp to a new sector 
                this.Everything();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }


    private void listGal() {
        
        Universe universe = PortOfKabru.getCurrentGame().getUniverse();
        Set<Galaxy> galaxies = universe.getGalaxies();
        
        int galNum = galaxies.size();
        System.out.println("here is the number of Galaxies: " + galNum);
    }
    
    private void listSectors() {
        
        int galNum = PortOfKabru.getCurrentGame().getUniverse().getNumbOfGalaxies();
        
        int secNum = (galNum*4)*11;
        System.out.println(secNum);
        
        
    }

    private void Everything() {
        Universe universe = PortOfKabru.getCurrentGame().getUniverse();
        Set<Galaxy> galaxies = universe.getGalaxies();
        
        //need to figure out how to access everything in the set of sets
    }
}
