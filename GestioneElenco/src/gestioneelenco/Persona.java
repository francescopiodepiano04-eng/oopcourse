/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneelenco;
import java.time.LocalDate;
import java.util.Objects;



public class Persona implements Comparable<Persona>{

    /*codice da completare */
    private final String nome;
    private final LocalDate dataNascita;
    private final String codiceFiscale;

    public Persona(String nome, LocalDate dataNascita, String codiceFiscale) {
        this.nome=nome;
        this.dataNascita=dataNascita;
        this.codiceFiscale=codiceFiscale;


    }



    public String getNome() {

        return nome;

    }



    public LocalDate getDataNascita() {

        return dataNascita;

    }



    public String getCodiceFiscale() {

        return codiceFiscale;

    }

    
    @Override
    public int hashCode() {
      
      int code = codiceFiscale == null ? 0 : codiceFiscale.hashCode();
      return code;
    }


    @Override
    public boolean equals(Object obj) {

        
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(obj instanceof Persona)) return false;
        
        Persona p = (Persona) obj;
        return this.codiceFiscale.equals(p.codiceFiscale);
    }



    @Override
    public String toString() {

        return "Nome=" + nome + ", Data di nascita=" + dataNascita + ", Codice fiscale=" + codiceFiscale;

    }

    @Override
    public int compareTo(Persona o) {
        if(this.nome.equals(o.nome)){
            return this.codiceFiscale.compareTo(o.codiceFiscale);
        }
        return this.nome.compareTo(o.nome);
    }


}