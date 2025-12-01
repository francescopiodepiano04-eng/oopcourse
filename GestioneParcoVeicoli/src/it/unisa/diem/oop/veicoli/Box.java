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
public abstract class Box {
    
    public int maxPosti;
    private String nome;

    public Box(int maxPosti, String nome) {
               this.maxPosti=maxPosti;
               this.nome=nome;
    }

    public int getMaxPosti() {
             return maxPosti;
    }

    public void setMaxPosti(int maxPosti) {
               this.maxPosti=maxPosti;
    }

    public String getNome() {
               return nome;
    }

    public void setNome(String nome) {
                this.nome=nome;
    }

    public abstract void entra(Veicoli v) throws AutorimessaPienaException, TargaNonValidaException;

    public abstract Veicoli esce() throws AutorimessaVuotaException;

    @Override
    public String toString() {
        /*stringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Nome Box = ");
        stringBuffer.append(getNome()); ... 
        return stringBuffer.toString();*/
        return "Nome Box = " + nome + ", Capienza = " + maxPosti;
    }



}
