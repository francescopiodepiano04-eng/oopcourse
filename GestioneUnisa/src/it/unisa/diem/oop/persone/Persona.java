/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.persone;

import java.io.Serializable;

/**
 *
 * @author angel
 */
public class Persona implements Clonabile<Persona>, Comparable<Persona>, Serializable{
    
    private String nome;
    private String cognome;
    private String codiceFiscale;
    
    public Persona(String nome, String cognome, String codiceFiscale){
        this.nome=nome;
        this.cognome=cognome;
        this.codiceFiscale=codiceFiscale;
    }
    
    
    
    public  String getNome(){
        return nome;
    } //protected permette all'accesso al metodo solo alle sottoclassi della superclasse che lo contiene
    
    public String getCognome(){
        return cognome;
    }
    
    public String getCodiceFiscale(){
        return codiceFiscale;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    @Override
    public boolean equals(Object obj){
        
        if(obj==null) return false;
        
        if(this==obj) return true;
        
        if(this.getClass()!=obj.getClass()) return false;
        
        Persona p = (Persona) obj;
        
        if(this.codiceFiscale.equals(p.codiceFiscale)) return true;
        
        return false;
        
        
    }
    
    
    //per ridefinire un metodo esistente si usa @Override per dargli un implementazione consona alla sottoclasse di appartenenza
    @Override  //annotazione=serve al compilatore per verificare che il nome del metodi da ridefinire sia scritto bene
    public String toString(){
        
        return "Nome: " + nome + "\nCognome: " + cognome + "\nCodice Fiscale: " + codiceFiscale;
        
    }
    
    
    
    @Override
    public Persona clona(){
        return new Persona(nome, cognome, codiceFiscale);
    }
    
    @Override
    public int hashCode(){
        int code = codiceFiscale==null ? 0 : codiceFiscale.hashCode();
        return code;
    }

    @Override
    public int compareTo(Persona o) {
        return this.codiceFiscale.compareTo(o.codiceFiscale);
    } //interfaccia implementata 
    
    
}
