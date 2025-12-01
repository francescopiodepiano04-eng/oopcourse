/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneclienti;

/**
 *
 * @author angel
 */
public class Cliente {
    //SPAZIO ATTRIBUTI
    private final String nome;
    private final String cognome;
    private final String codiceFiscale;
    private final String indirizzo;
    
    //SPAZIO METODI
    public Cliente(String nome, String cognome, String codiceFiscale, String indirizzo){
        this.nome=nome;
        this.cognome=cognome;
        this.codiceFiscale=codiceFiscale;
        this.indirizzo=indirizzo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCognome(){
        return this.cognome;
    }
    
    public String getCodiceFiscale(){
        return this.codiceFiscale;
    }
    
    public String getIndirizzo(){
        return this.indirizzo;
    }
    
    public String stampaCliente(){
        return nome + cognome + ": " + "(Codice fiscale: " + codiceFiscale + ")" + "-----" + "(Indirizzo: " + indirizzo + ")";
    }
    
    
    
    
}
