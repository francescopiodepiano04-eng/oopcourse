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
public class StudenteErasmus extends Studente {
    
    
    public StudenteErasmus(String nome, String cognome, String codiceFiscale, String matricola, float votoMedio){
        super(nome, cognome, codiceFiscale, matricola, votoMedio*3);
    }
    
    
    @Override
    public String getRuolo(){
        return "Studente Erasmus";
    }
    
    @Override
    public float getVotoMedio(){
        return super.getVotoMedio()/3;
    }
    
    
    
    @Override
    public String toString(){
        return super.toString() + "\nVoto Medio (trentesimi): " + getVotoMedio();
    }
}
