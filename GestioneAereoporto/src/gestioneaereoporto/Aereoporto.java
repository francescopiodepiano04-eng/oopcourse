/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneaereoporto;
import gestioneaereoporto.interfacce.CodeChecker;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Aereoporto {
    private final List<Aereomobile> l;
    private final CodeChecker c;
    
    public Aereoporto(CodeChecker c){
        this.l=new ArrayList<>();
        this.c=c;
    }
    
    public boolean inserisci(Aereomobile a){
        if(c == null){
            l.add(a);
            return true;
        }
        if(c.check(a.getCodice())){
            l.add(a);
            return true;
        }else{
            return false;
        }
    }
    
    public Aereomobile cerca(String codice){
        for(Aereomobile a : l){
            if(a.getCodice().equals(codice)){
                return a;
            }
        }
        return null;
    }
    
    public Aereomobile rimuovi(String codice){
        for(Aereomobile a : l){
            if(a.getCodice().equals(codice)){
                l.remove(a);
                return a;
            }
        }
        return null;
    }
    
    public int elementi(){
        return l.size();
    }
    
    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();
        for(Aereomobile a : l){
            str.append(a.toString());
        }
        return str.toString();
    }
}
