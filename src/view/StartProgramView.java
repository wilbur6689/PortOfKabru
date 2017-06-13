/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import exceptions.GameControlException;
import model.Player;

/**
 *
 * @author wilbur
 */
public class StartProgramView extends View {
    
    public StartProgramView() {
            super( "Hello world, your program is working "
                    + "  "
                    + "  "
                    + "Please enter your name:  ");}
    
    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            this.console.println("\nInvalid players name: " 
                    + "The name must be greater than one character in length");
            return false;
        
        }
        
        Player player = null;
        
        try {
            // Call createPlayer() control function
            player = GameControl.createPlayer(playersName);
            }
            catch (GameControlException me){
                this.console.println(me.getMessage());
            }
            if (player == null) { //if unsuccessful
                this.console.println("\nError creating the player.");
                return false;
            }


            this.displayNextView(player);

            return true;

        }
    
        private void displayNextView(Player player) {
        this.console.println("\n ====================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n ====================================="
                         );
        
        PortMenuView portMenuView = new PortMenuView();
        
        portMenuView.display();
    }
    
}
