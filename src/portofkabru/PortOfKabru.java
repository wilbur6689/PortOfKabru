/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portofkabru;

import view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Player;
import view.ErrorView;

/**
 *
 * @author Phillip Willis
 */
public class PortOfKabru {

    /**
     * @param args the command line arguments
     */
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = null;
        
        try {
            
            PortOfKabru.inFile = new BufferedReader (new InputStreamReader (System.in));
            PortOfKabru.outFile = new PrintWriter (System.out, true);
            String filePath = "log.txt";
            PortOfKabru.logFile = new PrintWriter(filePath);
            
            startProgramView = new StartProgramView ();
            startProgramView.display();
        } catch (Throwable te) {
            ErrorView.display("StartProgramView","Error reading the input: " + te.getMessage() );
            te.printStackTrace();
                    
        }
        finally {
            try {
                if (PortOfKabru.inFile != null);
                PortOfKabru.inFile.close();
                
                if (PortOfKabru.outFile != null);
                PortOfKabru.outFile.close();
                
                if (PortOfKabru.logFile != null);
                PortOfKabru.logFile.close();
            } catch (IOException ex) {
                Logger.getLogger(PortOfKabru.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setPlayer(Player player) {
        PortOfKabru.player = player;
    }
    
}
