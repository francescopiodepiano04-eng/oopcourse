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
public class Cameriere implements Runnable{
    private final String nome;
    private final Comande comande;
    private final Random random;
    
    public Cameriere(String nome, Comande comande){
        this.comande=comande;
        this.nome=nome;
        this.random=new Random(12);
    }
    
    public String getNome(){
        return nome;
    }

    @Override
    public void run() {
        Menu menu = new Menu();
        while(!Thread.currentThread().isInterrupted()){
            int tavolo = 1 + random.nextInt(4);
            int quantità = 1 + random.nextInt(3);
            String piatto = menu.getPiatto();
            
            try{
                Thread.sleep(5000+random.nextInt(5000));
            }catch(InterruptedException ex){
                System.err.println("Interrupted while sleeping!");
            }
            Ordinazione ord = new Ordinazione(piatto, tavolo, quantità);
            comande.aggiungiOrdinazione(ord);
            System.out.println("Ordinazione presa da "+ nome + ": "+ord);
        }
    }
    
}
