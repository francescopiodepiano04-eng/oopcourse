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
public class Camion extends Veicoli{
    private final int numAssi;
    
    
    //costruttore
    public Camion(String numTelaio, String modello, String alimentazione, String targa, int numAssi){
        super(numTelaio, modello, alimentazione, targa);
        this.numAssi=numAssi;
    }
    
    public int getNumAssi(){
        return numAssi;
        
        
        
    }
    
    @Override
    public boolean controllaTarga(){
        String targa=getTarga();
        if(targa.length()!=8){
            return false;
        }
        for(int i=0; i<2; i++){
            if(!Character.isLetter(targa.charAt(i))){
                return false;
            }
        }
        for(int i=2; i<targa.length(); i++){
            if(!Character.isDigit(targa.charAt(i))){
                return false;
            }
        }
        return true;  //[a-zA-Z]{2}\d{6} da usare nei prossimi controllaTarga
        //return getTarga().matches("^[a-zA-Z]{2}\\d{6}$")
    }
    
    
    @Override
    public String toString(){
        return super.toString() + ", Numero assi = " + numAssi;
    }
}
