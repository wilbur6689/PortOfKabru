/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import portofkabru.PortOfKabru;

/**
 *
 * @author wilbur
 */
public class PlayerShipView extends View {
    
    public PlayerShipView() {
        super("\n   |---------------------------------------------------"
            + "\n   |     Your Ship:                                    "
            + "\n   |                                                   "
            + "\n   |  Health:            " + PortOfKabru.getPlayer().getShip().getCurrentHealth()
            + "\n   |  Sheilds:           " + PortOfKabru.getPlayer().getShip().getCurrentShields()
            + "\n   |  Total Cargo Bays:  " + PortOfKabru.getPlayer().getShip().getCargoBays()
            + "\n   |     " 
            + "\n   |  Warp Speed:        " + PortOfKabru.getPlayer().getShip().getShipSpeed()
            + "\n   |  Warp Distance:     " + PortOfKabru.getPlayer().getShip().getWarpDist()
            + "\n   |          "
            + "\n   |  Current Sector:    " + PortOfKabru.getPlayer().getShip().getCurrentSec()
            + "\n   |  Previous Sector:   " + PortOfKabru.getPlayer().getShip().getPrevSec()
            + "\n   |          "
            + "\n   |          "
            + "\n   | ---   Press Q   ----------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {

            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }
}
