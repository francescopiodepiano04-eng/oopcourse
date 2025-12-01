/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionemagazzino;

import gestionemagazzino.Fatturabis;
import gestionemagazzino.Fatturabis.Riga;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author angel
 */
public class MainFattura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatturabis f = new Fatturabis("Spese cancelleria", LocalDate.now());
        
        f.aggiungi(new Prodotto("Penna", 3.0F, "2024-05-01"), 3);
        f.aggiungi(new Prodotto("Matita", 1.5F, "2024-05-01"), 2);
        f.aggiungi(new Prodotto("Gomma", 2.0F, "2024-05-01"), 1);
        
        System.out.println(f);
        System.out.println("Totale fattura: " + f.getTotale());
        
        //Fatturabis.Riga r = f.new Riga(new Prodotto("Gomma", 2.0F, "2024-05-01"), 1);  //inner class publica
        
        //Fatturabis.Riga r = new Fatturabis.Riga(new Prodotto("Gomma", 2.0F, "2024-05-01"), 0);            //inner class static
        //Riga r1 = new Riga(new Prodotto("Gomma", 2.0F, "2024-05-01"), 0);    //inner class static con import
        
        //classi anonime: sono classi senza nome istanziate anche esse in un blocco e ci consentono di istanziare interfacce senza implementarle in una classe, usate molto nelle interfacce grafiche
        Set<Prodotto> prodotti = new TreeSet<>( (x1, x2) -> {
            return Integer.compare(x2.getCodice(), x1.getCodice()); }); //interfaccia funzionale = interfaccia con un solo metodo
          //la lambda expression vale solo per le interfacce funzionali
        
        prodotti.add(new Prodotto("Penna", 3.0F, "2024-05-01"));
        prodotti.add(new Prodotto("Matita", 2.0F, "2024-05-01"));
        prodotti.add(new Prodotto("Gomma", 2.5F, "2024-05-01"));
        
        System.out.println(prodotti);
    }
    
}
