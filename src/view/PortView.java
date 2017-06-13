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
public class PortView extends View{
    
    public PortView() {
        super("\n   w - Warp to sector"
            + "\n   K - Known Ports"
            + "\n   T - Trade goods with the locals"
            + "\n   S - Space Dock"
            + "\n   R - Rumors"
            + "\n   Q - Quit"
            + "\n------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "W": // warp to a new sector 
                this.spaceWarp();
                break;
            case "K": // lists all the known space ports to the player
                this.knowPorts();
                break;
            case "T": // shows a list of goods
                this.tradeGoods();
                break;
            case "S": // go to the space dock to work on your ship
                this.spaceDock();
                break;
            case "R": //help menu
                this.rumors();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }

    private void spaceWarp() {
        System.out.println("You have called a Function");
    }

    private void knowPorts() {
        System.out.println("You have called a Function");
    }

    private void tradeGoods() {
        System.out.println("You have called a Function");
    }

    private void spaceDock() {
        System.out.println("You have called a Function");
    }

    private void rumors() {
        System.out.println("You have called a Function");
    }
}
