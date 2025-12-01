/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneaereoporto2;

/**
 *
 * @author angel
 */
public abstract class Aeromobile {
    private final String codice;
    private final int numSequenziale;
    static int i=0;
    
    
    public Aeromobile(String codice){
        this.codice=codice;
        i++;
        this.numSequenziale=i;
    }
    
    public String getCodice(){
        return codice;
    }
    
    public int getNumSequenziale(){
        return numSequenziale;
    }
    
    @Override
    public String toString(){
        return "Aeromobile n." + getNumSequenziale() + " - Codice = " + getCodice();
    }
}
