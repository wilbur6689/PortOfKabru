/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import model.Galaxy;
import model.Quadrant;
import model.Sector;
import model.Universe;

/**
 *
 * @author wilbur
 */
public class UniverseControl {
    
    public static Universe createUniverse() {
        
        Universe universe = new Universe();
           
        //int galaxyNum = universe.getNumbOfGalaxies();
        int galaxyNum = 10;
        
        for(int h=0;h<galaxyNum;h++) {
        Set<Galaxy> galSet = new LinkedHashSet<Galaxy>();
            
            //this generates all the galaxies 
            for(int i=0;i<5;i++){    
                int quadNum = 01;                 
                Set<Quadrant> quadSet = new LinkedHashSet<Quadrant>();
                
                //this generates all the Quadrants
                for(int j=0;j<4;j++){
                    int secNum = 01;
                    Set<Sector> sectorSet = new LinkedHashSet<Sector>();
                    
                    //this will generate all the sectors and their name.
                    for(int k=0;k<5;k++) {
                        Sector sector = new Sector();
                        sector.setSecName("G" + galaxyNum + "Q" + quadNum + "S" + secNum);
                        sectorSet.add(sector);
                        secNum++;
                    }
                quadNum++;
                Quadrant quadrant = new Quadrant();
                quadrant.setSectors(sectorSet);
                quadSet.add(quadrant);
                }
            galaxyNum++;
            Galaxy galaxy = new Galaxy();
            galaxy.setQuadrants(quadSet);          
            }
        universe.setGalaxies(galSet);
        }
        return universe;
    }
    
    public void linkSectors() {
        
        
        // I will have to create a funtion that will loop through all the created galaxies, quadrants, and sectors        
        // and then connect all the different sectors together.
        
        // Each quadrant will follow the same pattern as show below
        // I will just need to increase the number on the galaxy and quadrant. 
        
            /*here is how the sectors connect in a single quadrant:
            *
            * Galaxy01Quadrant01Sector01
            *       short hand -> G01Q01S01
            *       a double splat: ** after the short name is to show a change in Galaxy or Quadrant
            *
            *G01QyS01
                Connections:
                    G01Q01S02
                    G01Q01S04
                    G02Q02S11**
            *G01QyS02
                Connections:
                    G01Q01S07
                    G01Q01S03
                    G01Q01S01
            *G01QyS03
                Connections:
                    G01Q01S05
                    G01Q01S04
                    G01Q01S02
            *G01QyS04
                Connections:
                    G01QyS09
                    G01QyS03
                    G01QyS01
            *G01QyS05
                Connections:
                    G01Q01S03
                    G01Q01S08
                    G01Q01S06
            *G01QyS06
                Connections:
                    G01Q01S05
                    G01Q01S08
                    G01Q03S06**
            *G01QyS07
                Connections:
                    G01Q01S02
                    G01Q01S10
                    G01Q01S11
            *G01QyS08
                Connections:
                    G01Q01S05
                    G01Q01S06
                    G01Q01S10
            *G01QyS09
                Connections:
                    G01Q01S04
                    G01Q01S10
                    G01Q01S11
            *G01QyS10
                Connections:
                    G01Q01S07
                    G01Q01S08
                    G01Q01S09
            *G01QyS11
                Connections:
                    G01Q01S07
                    G01Q01S09
                    G01Q02S01**
            *
            */
        
    }
}
