/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedomotica;

import gestionedomotica.azioni.Azione;
import gestionedomotica.condizioni.Condizione;

/**
 *
 * @author angel
 */
public class Regola {
    private final Condizione cond;
    private final Azione az;
    
    public Regola(Condizione cond, Azione az){
        this.cond=cond;
        this.az=az;
    }
    
    public boolean applica() throws Exception{
        if(cond.verifica()){
            try{
                az.esegui();
                return true;
            }catch(Exception ex){
                return false;
            }
        }
        return false;
    }
    
    public Condizione getCondizione(){
        return cond;
    }
    
    public Azione getAzione(){
        return az;
    }
    
    @Override
    public String toString(){
        return "Informazioni regola - " + cond.toString() + "  -  " + az.toString();
    }
}
