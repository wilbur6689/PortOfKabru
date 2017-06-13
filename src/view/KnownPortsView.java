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
public class KnownPortsView extends View {
    public KnownPortsView() {
        super("\n   |-------------------------------------------------"
            + "\n   | This section will list all of your known Ports: "
            + "\n   |    "
            + "\n   |  " 
            + "\n   |---   Press Q   ---------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {

            default:
                this.console.println("\n*** Invalid selection *** Try again");

        }
        return false;
    }
}
