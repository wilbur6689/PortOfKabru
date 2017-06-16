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
            + "\n   |  Health:            " + PortOfKabru.getCurrentGame().getPlayer().getShip().getCurrentHealth()
            + "\n   |  Sheilds:           " + PortOfKabru.getCurrentGame().getPlayer().getShip().getCurrentShields()
            + "\n   |  Total Cargo Bays:  " + PortOfKabru.getCurrentGame().getPlayer().getShip().getCargoBays()
            + "\n   |     " 
            + "\n   |  Warp Speed:        " + PortOfKabru.getCurrentGame().getPlayer().getShip().getShipSpeed()
            + "\n   |  Warp Distance:     " + PortOfKabru.getCurrentGame().getPlayer().getShip().getWarpDist()
            + "\n   |          "
            + "\n   |  Current Sector:    " + PortOfKabru.getCurrentGame().getPlayer().getShip().getCurrentSec()
            + "\n   |  Previous Sector:   " + PortOfKabru.getCurrentGame().getPlayer().getShip().getPrevSec()
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
