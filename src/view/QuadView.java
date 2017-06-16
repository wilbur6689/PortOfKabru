/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.UniverseControl;
import java.util.Set;
import model.Quadrant;
import model.Sector;
import model.Universe;

/**
 *
 * @author wilbur
 */
public class QuadView extends View{
    
    public QuadView() {
        super("\n   L - List Known Sectors"
            + "\n   Q - Quit"
            + "\n------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "L": // warp to a new sector 
                this.listSectors();
                break;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }

    private void listSectors() {
        
        
        Universe universe = UniverseControl.createUniverse();
        
        System.out.println(universe);
    }
}
