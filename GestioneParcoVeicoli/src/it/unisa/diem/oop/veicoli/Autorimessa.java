/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.veicoli;

import it.unisa.diem.oop.eccezioni.AutorimessaPienaException;
import it.unisa.diem.oop.eccezioni.AutorimessaVuotaException;
import it.unisa.diem.oop.eccezioni.TargaNonValidaException;

/**
 *
 * @author angel
 */
public class Autorimessa extends Box {
    private final Veicoli veicoli[];
    private int testa=0;
    private int coda=0;
    private int riemp=0;

  // COMPLETARE DEFINENDO GLI ATTRIBUTI NECESSARI
  
    public Autorimessa(int maxPosti, String nome) {
        super(maxPosti, nome);
        this.veicoli=new Veicoli[super.maxPosti];
        this.testa=testa;
        this.coda=coda;
        this.riemp=riemp;
    }

    private boolean autorimessaPiena() {
               return riemp==super.maxPosti;
    }

    private boolean autorimessaVuota() {
                return riemp==0;
    }

    @Override
    public void entra(Veicoli v) throws AutorimessaPienaException, TargaNonValidaException {
        if(!v.controllaTarga()){
            throw new TargaNonValidaException("Targa non valida. Ingresso vietato");
        }
        if(autorimessaPiena()){
            throw new AutorimessaPienaException("Autorimessa piena. Ingresso vietato.");
            
        }
            veicoli[coda]=v;
            coda=(coda+1)%super.maxPosti;
            riemp++;
        
    }

    @Override
    public Veicoli esce() throws AutorimessaVuotaException {
        if(autorimessaVuota()){
            throw new AutorimessaVuotaException("Autorimessa vuota. Uscita vietata.");
        }
            Veicoli v=veicoli[testa];
            veicoli[testa]=null;
            testa=(testa+1)%super.maxPosti;
            riemp--;
            return v;
            
        
    }

    @Override
    public String toString() {
        StringBuffer str=new StringBuffer();
        System.out.println("Veicoli presenti: ");
        for(int i=0; i<riemp; i++){
            str.append(veicoli[(testa+i)%riemp]);
            
        }
        return str.toString();
    }
}
//tipo enumerativo: una struttura con valori stringa

//public enum Day{ sunday, ... }

