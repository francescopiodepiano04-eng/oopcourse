/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneelenco;
import java.time.LocalDate;
/**
 *
 * @author angel
 */
public class Tecnico extends Persona implements Comparable<Persona>{
    
    private final String dipartimento;

    public Tecnico(String nome, LocalDate dataNascita, String codiceFiscale, String dipartimento){
        super(nome, dataNascita, codiceFiscale);
        this.dipartimento=dipartimento;
        
    }
    
    public String getDipartimento(){
        return dipartimento;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Dipartimento=" + dipartimento;
    }
   
  

    
    
    
}