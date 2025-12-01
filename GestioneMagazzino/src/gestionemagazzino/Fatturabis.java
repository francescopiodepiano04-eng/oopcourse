/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionemagazzino;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
public class Fatturabis {
    public String descrizione;
    private LocalDate dataEmissione;
    
    private List<Riga> righe;
    
    public Fatturabis(String descrizione, LocalDate dataEmissione){
        this.descrizione=descrizione;
        this.dataEmissione=dataEmissione;
        //riservato collezione
        
        this.righe = new ArrayList<>();
    }
    
    public void aggiungi(Prodotto p, int quantita){
        righe.add(new Riga(p,quantita));
    }
    
    
    
    public float getTotale(){
        float totale=0;
        for(Riga r : righe){
            totale += r.getProdotto().getCosto()*r.getQuantita();
        }
        return totale;
    }
    
    public float getTotaleScontato(){
        float totale=0;
        
        class CalcolatoreSconto{   //classe locale: classe usabile dentro un blocco come un metodo ed è usata temporaneamente
            float getPrezzoScontato(Riga r){
                int gruppitre=r.getQuantita()%3;
                
                float costo;
                costo=r.p.getCosto()*(r.quantita-gruppitre);
                return costo;
                
            }
        }
        
        CalcolatoreSconto calc=new CalcolatoreSconto();
        for(Riga r : righe){
            totale += calc.getPrezzoScontato(r);
        }
        
        return totale;
    }
    
    @Override
        public String toString(){
        StringBuilder str = new StringBuilder("Fattura: " + descrizione + " emessa il " + dataEmissione.toString() + '\n');
        for(Riga r: righe){
            str.append(r);
        }
        return str.toString();
    }
    
        
        
        
    public class Riga{   //visibilità che può essere di default o private e la classe innestata non potrà essere referenziata al di fuori di Fattura
        private Prodotto p;
        private int quantita;
        private String descrizione;
        
        Prodotto getProdotto(){
            return p;
        }
        
        int getQuantita(){
            return quantita;
        }
        
        public Riga(Prodotto p, int quantita){
            this.p=p;
            this.quantita=quantita;
            String descrizione;
            descrizione="Valore iniziale";
            this.descrizione="valore descrizione riga";  //richiama in Riga
            Fatturabis.this.descrizione="valore iniziale";  //richiama in Fattura
        }
        
        
        
        @Override
        public String toString(){
            return p.toString() + "quantita: "+ quantita+'\n';
        }
        
    }
}
