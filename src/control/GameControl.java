/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exceptions.GameControlException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Integer.parseInt;
import java.util.Set;

import model.Player;
import model.Game;
import model.Quadrant;
import model.Ship;
import model.Universe;
import portofkabru.PortOfKabru;

/**
 *
 * @author wilbur
 */
public class GameControl {
    
    public static Player createGame(String name) throws GameControlException {

        if (name == null) {
            throw new GameControlException("The name variable was null.");
        }
        Game game = new Game();        
        Player player = new Player();
        
        Universe universe = createNewUniverse();
        Ship ship = createStartShip(universe);
        player.setName(name);
        player.setShip(ship);
        
        
        game.setPlayer(player);//save the player
        game.setUniverse(universe);
        PortOfKabru.setCurrentGame(game);
        return player;
    }
    
    public static Ship createStartShip(Universe universe) {
      
       Ship ship = new Ship();
       
       ship.setCurrentHealth(100);
       ship.setMaxHealth(100);
       ship.setCurrentSec("0200");
       ship.setMaxShields(10);
       ship.setCurrentShields(10);
       ship.setShipSpeed(1);
       ship.setWarpDist(50);
       ship.setPrevSec("0200");
       
       return ship;
    }
    
    public static int numOfSectors(){
        
        int numOfSectors = 0;
        
        Universe universe = PortOfKabru.getCurrentGame().getUniverse();
        
       return numOfSectors;
        
    }

    private static Universe createNewUniverse() {
        System.out.println("\n |--------------------------------------------|"
            + "\n |                                            |"
            + "\n | How many Galaxies do you want to create?   |"
            + "\n |                                            |"
            + "\n |--------------------------------------------|");
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        String galNum = "";
        try {
            galNum = keyboard.readLine();
        } catch (IOException ex) {
            System.out.println("You entered a wrong number");
        }
        int galNum1 = parseInt(galNum); 
        
        Universe universe = UniverseControl.createUniverse(galNum1);
 
        System.out.println("You have made a new Universe");
        
        return universe;
    }
}
