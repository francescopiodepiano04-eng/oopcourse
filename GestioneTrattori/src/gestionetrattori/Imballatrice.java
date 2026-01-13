/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetrattori;

/**
 *
 * @author angel
 */
public class Imballatrice extends Trattore {
    
    int numeroRulli;
    
    public Imballatrice(int idTelaio, String modello, double peso, int annoImmatricolazione, int numeroRulli) {
        super(idTelaio, modello, peso, annoImmatricolazione);
        this.numeroRulli = numeroRulli;
    }
    
    public int getNumeroRulli(){
        return numeroRulli;
    }
    
    @Override
    public void eseguiAzione() {
        System.out.println("Imballatrice ID: " + super.getIdTelaio());
        System.out.println("  + in azione...");
    }
    
}