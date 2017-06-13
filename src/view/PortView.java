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
        super("\n   S - Space Warp"
            + "\n   K - Known Ports"
            + "\n   T - Trade with the locals"
            + "\n   W - Work on your Space Ship"
            + "\n   B - Buy new Space Ship"
            + "\n   R - Rumors"
            + "\n   Q - Quit"
            + "\n------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "S": // create and start a new game
                this.spaceWarp();
                break;
            case "K": // load players game
                this.knowPorts();
                break;
            case "T": //help menu
                this.trade();
                break;
            case "W": // create and start a new game
                this.workOnShip();
                break;
            case "B": // load players game
                this.buyShip();
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

    private void trade() {
        System.out.println("You have called a Function");
    }

    private void workOnShip() {
        System.out.println("You have called a Function");
    }

    private void buyShip() {
        System.out.println("You have called a Function");
    }

    private void rumors() {
        System.out.println("You have called a Function");
    }
}
