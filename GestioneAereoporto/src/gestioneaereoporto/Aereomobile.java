/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneaereoporto;

/**
 *
 * @author angel
 */
public abstract class Aereomobile {
    private final String codice;
    private int numSequenziale;
    private static int allocati=0;
    
    public Aereomobile(String codice){
        allocati++;
        this.codice=codice;
        this.numSequenziale=allocati;
    }
    
    public String getCodice(){
        return codice;
    }
    
    public int getNumSequenziale(){
        return numSequenziale;
    }
    
    @Override
    public String toString(){
        return "\nAereomobile n. " + numSequenziale + " - Codice = " + codice;
    }
}
