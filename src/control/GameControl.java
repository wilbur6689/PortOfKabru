/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Player;
import model.Game;
import model.Ship;
import portofkabru.PortOfKabru;

/**
 *
 * @author wilbur
 */
public class GameControl {
    
    public static Player createPlayer(String name) throws GameControlException {

        if (name == null) {
            throw new GameControlException("The name variable was null.");
        }

        Player player = new Player();
        Ship ship = createStartShip();
        player.setName(name);
        player.setShip(ship);
        
        
        PortOfKabru.setPlayer(player); //save the player  
        
        return player;
    }
    
    public static Ship createStartShip() {
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
}
