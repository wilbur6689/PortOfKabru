/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author wilbur
 */
public class SpaceDockView extends View {
    
    public SpaceDockView() {
        super("\n   E - Examine your ship"
            + "\n   U - upgrade your ship"
            + "\n   W - Work on your Space Ship"
            + "\n   B - Buy new Space Ship"
            + "\n   Q - Quit back to the port menu"
            + "\n------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "E": // warp to a new sector 
                this.yourShip();
                break;
            case "U": // lists all the known space ports to the player
                this.upgrade();
                break;
            case "W": // allows the player to make slight adjustments to the spaceship
                this.workOnShip();
                break;
            case "B": // go to the space dock to work on your ship
                this.buyNewShip();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }

    private void yourShip() {
        this.console.println("you have selected to examain your ship");
    }

    private void upgrade() {
        this.console.println("you have selected to upgrade your ship");
    }

    private void workOnShip() {
        this.console.println("you have selected to work on your ship");
    }
    
    private void buyNewShip() {
        this.console.println("you have selected to buy a new ship");
    }



}
