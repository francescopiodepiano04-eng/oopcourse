/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedomotica.azioni;

import gestionedomotica.dispositivi.Attuatore;

/**
 *
 * @author angel
 */
public class ImpostaStatoAccensione implements Azione{
    private final Attuatore attuatore;
    private final boolean setOn;
    
    public ImpostaStatoAccensione(Attuatore attuatore, boolean setOn){
        this.attuatore=attuatore;
        this.setOn=setOn;
    }

    @Override
    public void esegui() {
        if(setOn){
            attuatore.accendi();
        }else{
            attuatore.spegni();
        }
    }
    
    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();
        if(setOn){
            str.append("Tipo azione: Accendi - attivata per: ").append(attuatore.toString());
        }else{
            str.append("Tipo azione: Spegni - attivata per: ").append(attuatore.toString());
        }
        return str.toString();
    }
    
}
