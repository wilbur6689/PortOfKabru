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
        player.setName(name);
        PortOfKabru.setPlayer(player); //save the player  
        return player;
    }
}
