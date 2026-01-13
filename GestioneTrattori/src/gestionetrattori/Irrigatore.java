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
public class Irrigatore extends Trattore {
    
    int numeroTestine;
    
    public Irrigatore(int idTelaio, String modello, double peso, int annoImmatricolazione, int numeroTestine) {
        super(idTelaio, modello, peso, annoImmatricolazione);
        this.numeroTestine = numeroTestine;
    }
    
    public int getNumeroTestine(){
        return numeroTestine;
    }
    
    public void eseguiAzione() {
        System.out.println("Irrigatore ID: " + super.getIdTelaio());
        System.out.println("  + in azione...");
    }
    
}
