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
public class AereoAMotore extends Aereomobile{
    private final int numRotori;
    
    public AereoAMotore(String codice, int numRotori){
        super(codice);
        this.numRotori=numRotori;
    }
    
    public int getNumRotori(){
        return numRotori;
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Tipo = Aereo a motore - Numero rotori = " + numRotori;
    }
}
