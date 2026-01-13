/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneristorante;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author angel
 */
public class BackupAutomatico implements Runnable{
    private final Comande comande;
    private static final int DELAY=20000;
    
    public BackupAutomatico(Comande comande){
        this.comande=comande;
        
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            try{
                comande.salvaOrdinazioni();
                System.out.println("BACKUP EFFETTUATO");
            }catch(IOException ex){
                System.err.println(ex.getMessage());
            }
            try{
                Thread.sleep(DELAY);
            }catch(InterruptedException ex){
                System.err.println("Interrupted while sleeping!");
            }
        }
    }
    
    
}
