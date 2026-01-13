/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneesami;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        // TODO code application logic here
        LibrettoEsami libretto = new LibrettoEsami();
        
        libretto = libretto.readFile("esami.txt");
        
        libretto.stampaInsegnamento();
        
        try {
            libretto.salvaOBJ("esamiSer.bin");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            LibrettoEsami lib_backup = libretto.leggiOBJ("esamiSer.bin");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
