/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetrattori;

import java.util.Objects;

/**
 *
 * @author angel
 */
public class Trattore {
    private final int idTelaio;
    private final String modello;
    private final double peso;
    private final int annoImmatricolazione;
    
    public Trattore(int idTelaio, String modello, double peso, int annoImmatricolazione){
        this.idTelaio=idTelaio;
        this.modello=modello;
        this.peso=peso;
        this.annoImmatricolazione=annoImmatricolazione;
    }
    
    public int getIdTelaio(){
        return idTelaio;
    }
    
    public String getModello(){
        return modello;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public int getAnnoImmatricolazione(){
        return annoImmatricolazione;
    }
    
    public void eseguiAzione(){
        System.out.println("Trattore ID: "+this.idTelaio+" in azione....");
    }
    
    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        if(this==o) return true;
        if(this.getClass()!=o.getClass()) return false;
        
        Trattore t = (Trattore) o;
        return this.idTelaio == t.idTelaio;
    }
    
    @Override
    public int hashCode(){
        int code = 7;
        code = 53 * code * Objects.hashCode(this.idTelaio);
        return code;
    }
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("ID Telaio: "+idTelaio+" \n");
        str.append("- Modello = "+modello+" \n");
        str.append("- Peso (kg) = "+peso+" \n");
        str.append("- Anno Immatricolazione = "+annoImmatricolazione+" \n");
        return str.toString();
    }
    
}
