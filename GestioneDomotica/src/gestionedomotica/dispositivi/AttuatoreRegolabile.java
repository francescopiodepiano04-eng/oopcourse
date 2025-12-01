/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedomotica.dispositivi;

import gestionedomotica.eccezioni.LivelloNonValidoException;

/**
 *
 * @author angel
 */
public abstract class AttuatoreRegolabile extends Attuatore {
    private double livello;
    private final double livelloMin;
    private final double livelloMax;
    
    public AttuatoreRegolabile(int id, double livelloMin, double livelloMax, double livello) throws LivelloNonValidoException {
        super(id);
        this.livelloMin = livelloMin;
        this.livelloMax = livelloMax;
        if(!(livello>=getLivelloMin() && livello<=getLivelloMax())){
            throw new LivelloNonValidoException("il livello inserito non è valido");
        }
        this.livello=livello;
    }
    
    public double getLivelloMin(){
        return livelloMin;
    }
    
    public double getLivelloMax(){
        return livelloMax;
    }
    
    public double getLivello(){
        return livello;
    }
    
    public void setLivello(double livello) throws LivelloNonValidoException {
        if(!(livello>=getLivelloMin() && livello<=getLivelloMax())){
            throw new LivelloNonValidoException("il livello inserito non è valido");
        }
        this.livello=livello;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Attuatore regolabile Liv/Min/Max = " + livello + "/" + livelloMin + "/" + livelloMax;
    }
}
