/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import exceptions.GameControlException;
import model.Player;
import portofkabru.PortOfKabru;

/**
 *
 * @author wilbur
 */
public class StartProgramView extends View {
    
    public StartProgramView() {
            super( "You wake up feeling refreshed and ready to take on the whole galaxy "
                    + "\n  "
                    + "\n  "
                    + "\n Please enter your name:  "
                    + "\n ");}
    
    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            this.console.println("\nInvalid players name: " 
                    + "The name must be greater than one character in length");
            return false;
        
        }
        
        Player player = null;
        
        try {
            // Call createGame() control function
            player = GameControl.createGame(playersName);
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
        PortOfKabru.getCurrentGame().setPlayer(player);
        PortView portView = new PortView();
        
        portView.display();
    }
    
}
