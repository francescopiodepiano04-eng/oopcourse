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
public class Autovettura extends Veicoli{
    private final int numeroPosti;
    
    //costruttore
    public Autovettura(String numTelaio, String modello, String alimentazione, String targa, int numeroPosti){
        super(numTelaio, modello, alimentazione, targa);
        this.numeroPosti=numeroPosti;
    }
    
    public int getNumeroPosti(){
        return numeroPosti;
    }
    
    @Override
    public boolean controllaTarga(){
        String targa=getTarga();
        if(targa.length()!=7){
            return false;
        }
        for(int i=0; i<2; i++){
            if(!Character.isLetter(targa.charAt(i))){
                return false;
            }
        }
        for(int i=2; i<5; i++){
            if(!Character.isDigit(targa.charAt(i))){
                return false;
            }
        }
        for(int i=5; i<targa.length(); i++){
            if(!Character.isLetter(targa.charAt(i))){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Numero posti= " + numeroPosti;
    }
    
}
