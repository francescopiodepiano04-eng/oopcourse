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
public class Aliante extends Aereomobile{
    private final double efficienza;
    
    public Aliante(String codice, double efficienza){
        super(codice);
        this.efficienza=efficienza;
    }
    
    public double getEfficienza(){
        return efficienza;
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Tipo = Aliante - Efficienza = " + efficienza;
    }
}
