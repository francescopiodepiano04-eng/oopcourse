/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneesami;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author angel
 */
public class EsameSuperato implements Comparable<EsameSuperato>, Serializable{
    private final String matricolaStudente;
    private final LocalDate giornoSuperamento;
    private final String nomeInsegnamento;
    private final int voto;
    private static int cont = 0;
    private final int id;
    
    public EsameSuperato(String matricolaStudente, LocalDate giornoSuperamento, String nomeInsegnamento, int voto){
        this.giornoSuperamento=giornoSuperamento;
        this.matricolaStudente=matricolaStudente;
        this.id=cont++;
        this.nomeInsegnamento=nomeInsegnamento;
        this.voto=voto;
    }
    //Map<String(nomeInsegnamneto),LinkedList<EsameSuperato>>
    
    public String getMatricolaStudente(){
        return matricolaStudente;
    }
    
    public LocalDate getGiornoSuperamento(){
        return giornoSuperamento;
    }
    
    public String getNomeInsegnamento(){
        return nomeInsegnamento;
    }
    
    public int getVoto(){
        return voto;
    }
    
    public int getID(){
        return id;
    }
    
    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        if(this==o) return true;
        if(this.getClass()!=o.getClass()) return false;
        EsameSuperato es = (EsameSuperato) o;
        return this.getID() == es.getID();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.id;
        return hash;
    }

    @Override
    public int compareTo(EsameSuperato o) {
        if(this.getID()>o.getID()) return 1;
        if(this.getID()==o.getID()) return 0;
        return -1;
    }
}
