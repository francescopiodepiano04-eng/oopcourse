/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneristorante;

import java.io.Serializable;

/**
 *
 * @author angel
 */
public class Ordinazione implements Serializable{
    private String piatto;
    private int tavolo;
    private int quantità;
    
    public Ordinazione(String piatto, int tavolo, int quantità){
        this.piatto=piatto;
        this.quantità=quantità;
        this.tavolo=tavolo;
    }
    
    public void setPiatto(String piatto){
        this.piatto=piatto;
    }
    
    public String getPiatto(){
        return piatto;
    }
    
    public int getTavolo(){
        return tavolo;
    }
    
    public void setTavolo(int tavolo){
        this.tavolo=tavolo;
    }
    
    public int getQuantità(){
        return quantità;
    }
    
    public void setQuantità(int quantità){
        this.quantità=quantità;
    }
    
    @Override
    public String toString(){
        return "Piatto: " + piatto + ", Tavolo: " + tavolo + ", Quantità: " + quantità;
    }
}
