/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.veicoli;

/**
 *
 * @author angel
 */
public abstract class Veicoli {
    private final String numTelaio;
    private final String modello;
    private final String alimentazione;
    private String targa;
    
    
    //costruttore
    public Veicoli(String numTelaio, String modello, String alimentazione, String targa){
        this.numTelaio=numTelaio;
        this.modello=modello;
        this.alimentazione=alimentazione;
        this.targa=targa;
    }
    
    //metodi getter
    public String getNumTelaio(){
        return numTelaio;
    }
    
    public String getModello(){
        return modello;
    }
    
    public String getAlimentazione(){
        return alimentazione;
    }
    
    public String getTarga(){
        return targa;
    }
    
    
    //metodo setter
    public void setTarga(String targa){
        this.targa=targa;
    }
    
    //metodo astratto
    public abstract boolean controllaTarga();
    
    //metodo toString
    @Override
    public String toString(){
        return "Numero di telaio = " + numTelaio + ", Modello = " + modello + ", Alimentazione = " + alimentazione + ", Targa = " + targa + ".\n";
       
    }
}
