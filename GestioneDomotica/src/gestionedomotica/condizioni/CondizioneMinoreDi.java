/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedomotica.condizioni;

import gestionedomotica.dispositivi.Sensore;

/**
 *
 * @author angel
 */
public class CondizioneMinoreDi implements Condizione{
    private final Sensore sensore;
    private final double valoreDiConfronto;
    
    public CondizioneMinoreDi(Sensore sensore, double valoreDiConfronto){
        this.sensore=sensore;
        this.valoreDiConfronto=valoreDiConfronto;
    }

    @Override
    public boolean verifica() {
        return this.sensore.getValore()<valoreDiConfronto;
    }
    
    @Override
    public String toString(){
        return "Tipo condizione: Minore di " + valoreDiConfronto + " - attivata per: " + sensore.toString();
    }
    
}
