/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.persone;

/**
 *
 * @author angel
 */
public class Studente extends PersoneUnisa {
    private float votoMedio;
    public Studente(String nome, String cognome, String codiceFiscale, String matricola, float votoMedio){
        
        super(nome, cognome, codiceFiscale, matricola);
        
        if(votoMedio<18 || votoMedio>31) throw new VotoNonConsentitoException("Il voto " + votoMedio + " non può essere usato.");
        
        this.votoMedio=votoMedio;
        
    }
    
    
    public float getVotoMedio(){
        return votoMedio;
    }
    
    @Override
    public String getRuolo() {
        return "Studente\n";
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if(this.getClass()!=o.getClass()) return false;
        
        Studente s = (Studente) o;
        return this.getMatricola().equals(s.getMatricola());
    }
    
    @Override
    public int hashCode(){
        return this.getMatricola().hashCode();
    }
    
    @Override
    public String toString(){
        return super.toString()+ "\nVoto Medio: " + votoMedio;
    }
    
    
}
