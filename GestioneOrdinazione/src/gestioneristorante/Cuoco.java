/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneristorante;

import java.util.Random;


/**
 *
 * @author angel
 */
public class Cuoco implements Runnable{
    private final Comande comande;
    private final Random random;
    
    public Cuoco(Comande comande){
        this.comande=comande;
        this.random=new Random(24);
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()) {
            Ordinazione ord = comande.consegnaOrdinazione();
            try{
                Thread.sleep(5000+random.nextInt(5000));
            } catch (InterruptedException ex) {
                System.err.println("Interrupted while sleeping!");
            }
            System.out.println("Piatto pronto: "+ord);
        }
    }
    
    
}


