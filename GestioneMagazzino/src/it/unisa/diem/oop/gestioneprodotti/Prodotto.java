/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneprodotti;

/**
 *
 * @author angel
 */
public class Prodotto {
    //SPAZIO ATTRIBUTI
    private final int codice;   //tramite la keyword final, l'attributo diventa immutabile
    private String descrizione;
    private final double costo;
    private String dataProduzione;
    
    
    
    
    //SPAZIO METODI
    public Prodotto(int codice, String descrizione, double costo, String dataProduzione){
        this.codice=codice;
        this.descrizione=descrizione;
        this.costo=costo;
        this.dataProduzione=dataProduzione;
        
    }
    
    public int getCodice(){
        return this.codice;
    }
    
    public String stampaProdotto(){
        String costoForm=String.format("%.2f", costo);
        return codice + ": " + descrizione + "(Costo: " + costoForm + ")" + "-----" + "(Data di produzione: " + dataProduzione + ")";
    }

    public String getDescrizione(){
        return descrizione;
    }
    
    public double getCosto() {
        return costo;
    }
    
    public String getDataProduzione() {
        return dataProduzione;
    }

    
}
