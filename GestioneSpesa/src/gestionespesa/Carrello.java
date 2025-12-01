/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionespesa;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author angel
 */
public class Carrello {
    private List<Prodotto> listaProdotti;
    
    public Carrello(){
        listaProdotti=new ArrayList<>();    
    }
    
    public void addProdotto(Prodotto p){
        listaProdotti.add(p);
        
    }
    
    public double getTotale(){
        double totale=0;
        for(Prodotto p: listaProdotti){
            totale=totale+p.getPrezzo();
        }  
        return totale;
    }
    
    public double getTotaleScontato(){
        double totaleScontato=0;
        for(Prodotto p: listaProdotti){
            totaleScontato=totaleScontato+p.applicaSconto();
        }
        return totaleScontato;
    }

    
    public void removeProdotto(Prodotto p){
        listaProdotti.remove(p);
        
    }
    
    public Prodotto getProdotto(int idx){
        return listaProdotti.get(idx);
        
    }
    
    
    @Override
    public String toString(){
        StringBuffer str= new StringBuffer();
        
        for(Prodotto p: listaProdotti){
            str.append(p.toString());
        }
        return str.toString();
    }
    
    
}
