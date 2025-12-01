/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedomotica.azioni;

import gestionedomotica.dispositivi.AttuatoreRegolabile;
import gestionedomotica.eccezioni.LivelloNonValidoException;

/**
 *
 * @author angel
 */
public class ImpostaLivello implements Azione{
    private final AttuatoreRegolabile ar;
    private final double livelloDaImpostare;
    
    public ImpostaLivello(AttuatoreRegolabile ar, double livelloDaImpostare){
        this.ar=ar;
        this.livelloDaImpostare=livelloDaImpostare;
    }
    

    @Override
    public void esegui() throws LivelloNonValidoException{
        if(!(livelloDaImpostare>=ar.getLivelloMin() && livelloDaImpostare<=ar.getLivelloMax())){
            throw new LivelloNonValidoException("il livello inserito non è valido");
        }
    }
    
    @Override
    public String toString(){
        return "Tipo azione: Imposta livello a " + livelloDaImpostare + " - attivata per: " + ar.toString();
    }
    
}
