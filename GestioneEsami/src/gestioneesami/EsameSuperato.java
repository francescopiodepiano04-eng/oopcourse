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
    private String matricolaStudente;
    private LocalDate giornoSuperamento;
    private String nomeInsegnamento;
    private int voto;
    private static int cont = 0;
    private int id;
    
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
    
    public void setMatricolaStudente(String mat){
        this.matricolaStudente=mat;
    }
    
    public LocalDate getGiornoSuperamento(){
        return giornoSuperamento;
    }
    
    public void setGiornoSuperamento(LocalDate giornoSup){
        this.giornoSuperamento=giornoSup;
    }
    
    public String getNomeInsegnamento(){
        return nomeInsegnamento;
    }
    
    public void setNomeInsegnamento(String insegn){
        this.nomeInsegnamento=insegn;
    }
    
    public int getVoto(){
        return voto;
    }
    
    public void setVoto(int voto){
        this.voto=voto;
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id=id;
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
    
    @Override
    public String toString(){
        return "*Esame superato*" +"\nmatricola = " + matricolaStudente + "\ndataSuperamento = "+giornoSuperamento+"\nnomeEsame = "+nomeInsegnamento+"\nvoto="+voto;
    }
}
