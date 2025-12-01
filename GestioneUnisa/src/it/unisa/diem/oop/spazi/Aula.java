/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.spazi;

import it.unisa.diem.oop.eccezioni.AccessibilePienoException;
import it.unisa.diem.oop.eccezioni.AccessibileVuotoException;
import it.unisa.diem.oop.persone.Persona;

/**
 *
 * @author angel
 */
public class Aula extends Spazio{
    private Persona persone[];
    private int riemp;

    public Aula(String nome, int maxPosti) {
        
        super(nome, maxPosti);
        
        persone=new Persona[maxPosti]; //array è composizione di Aula
        
        this.riemp=0;
        
    }

    @Override
    public boolean isPieno(){
        return riemp == super.getMaxPosti(); //oppure persone.length
    }

    @Override
    public boolean isVuoto() {
        return riemp == 0;
    }

    @Override
    public String getTipo() {
        return "AULA";
    }

    @Override
    public void entra(Persona p) throws AccessibilePienoException {
        
        if(isPieno()){
          //System.out.println("Aula piena");
          //return;
          throw new AccessibilePienoException("Aula piena.");
        }
        persone[riemp++]=p;
    }

    @Override
    public Persona esce() throws AccessibileVuotoException{
        
        if(isVuoto()){
            throw new AccessibileVuotoException("Aula vuota.");
            //System.out.println("Aula vuota");
            //return null;
        }
        Persona p=persone[riemp-1];
        persone[--riemp]=null;
        
        return p;
    }
    
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder(super.toString()+'\n');
        
        for(int i=0; i<riemp; i++){
            
            sb.append(persone[i]);
            
            
        }
        return sb.toString();
    }
    
}
