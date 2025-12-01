/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneautorimessa;

/**
 *
 * @author angel
 */
public class Autovettura extends Veicolo {
    private final int numPosti;

    public Autovettura(String numTelaio, String modello, String alimentazione, String targa, int numPosti) {
        super(numTelaio, modello, alimentazione, targa);
        this.numPosti=numPosti;
    }
    
    public int getNumPosti(){
        return numPosti;
    }
    
    @Override
    public boolean controllaTarga() {
        String targa=getTarga();
        if(targa.length()!=7){
            return false;
        }
        for(int i=0; i<2; i++){
            if(!Character.isLetter(targa.charAt(i))) return false;
        }
        for(int i=2; i<5; i++){
            if(!Character.isDigit(targa.charAt(i))) return false;
        }
        for(int i=5; i<targa.length(); i++){
            if(!Character.isLetter(targa.charAt(i))) return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Numero posti = " + numPosti + "\n";
    }
    
}
