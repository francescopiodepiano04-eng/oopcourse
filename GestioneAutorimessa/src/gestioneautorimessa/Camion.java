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
public class Camion extends Veicolo{
    
    private final int numeroAssi;
    
    public Camion(String numTelaio, String modello, String alimentazione, String targa, int numeroAssi){
        super(numTelaio, modello, alimentazione, targa);
        this.numeroAssi=numeroAssi;
    }
    
    public int getNumAssi(){
        return numeroAssi;
    }

    @Override
    public boolean controllaTarga() {
        String targa=getTarga();
        if(targa.length()!=8) return false;
        for(int i=0; i<2; i++){
            if(!Character.isLetter(targa.charAt(i))) return false;
        }
        for(int i=2; i<targa.length(); i++){
            if(!Character.isDigit(targa.charAt(i))) return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Numero assi = " + numeroAssi + "\n";
    }
    
}
