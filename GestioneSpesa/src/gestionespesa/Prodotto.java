/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionespesa;

/**
 *
 * @author angel
 */
import java.time.LocalDate;

public abstract class Prodotto {
    private String codice;
    private String descrizione;
    private double prezzo;
    
    public Prodotto(String codice, String descrizione, double prezzo){
        this.codice=codice;
        this.descrizione=descrizione;
        this.prezzo=prezzo;
    }
    
    public String getCodice(){
        return codice;
    }
    
    public String getDescrizione(){
        return descrizione;
    }
    
    public double getPrezzo(){
        return prezzo;
    }
    
    public void setCodice(String codice){
        this.codice=codice;
    }
    
    public void setDescrizione(String descrizione){
        this.descrizione=descrizione;
    }
    
    public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
    }
    
    public abstract double applicaSconto();
    
    @Override
    public String toString() {
        return "\nProdotto:\n" + "codice=" + codice + "\ndescrizione=" + descrizione + "\nprezzo=" + prezzo ;
    }
}
