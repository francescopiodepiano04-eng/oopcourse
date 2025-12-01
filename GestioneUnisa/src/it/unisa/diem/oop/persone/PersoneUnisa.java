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
public abstract class PersoneUnisa extends Persona {
    
    String matricola;
    
    
    public PersoneUnisa(String nome, String cognome, String codiceFiscale, String matricola){
        
        super(nome,cognome,codiceFiscale);
        
        this.matricola=matricola;
    }
    
    public abstract String getRuolo(); //metodo astratto cioè un metodo senza implementazione
    
    public String getMatricola(){
        return matricola;
    }
    
    @Override
    public String toString(){
        return "\n---->"+getRuolo()+"\n"+super.toString()+"\nMatricola: " + matricola;
    }
    //posso usare un metodo astratto in una classe astratta perchè la sottoclasse che la estende sarà obbligata a fornire un'implementazione
    
    
    
}
