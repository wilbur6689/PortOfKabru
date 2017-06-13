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
public class MainMenuView extends View {
    public MainMenuView() {
        super("\n |-----------------------------------------------|   "
            + "\n |                                               |"
            + "\n |              The Port of Kabru                |"
            + "\n |                                               |"
            + "\n |-----------------------------------------------|"
            + "\n |                                               |"
            + "\n |   N - Start a new game                        |"
            + "\n |   L - Load Game                               |"
            + "\n |   H - Get Help on how to play the game        |"
            + "\n |   Q - Quit                                    |"
            + "\n |-----------------------------------------------|");
    }
    
    private String promptMessage;
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "L": // load players game
                this.loadGame();
                break;
            case "H": //help menu
                this.displayHelpMenu();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }

    private void startNewGame() {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }

    private void loadGame() {
        System.out.println("You have called the loadNewGame Function");
    }

    private void displayHelpMenu() {
        System.out.println("You have called the displayHelpMenu Function");
    }
}
