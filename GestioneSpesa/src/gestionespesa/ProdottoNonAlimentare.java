/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionespesa;

/**
 *
 * @author angel
 */
public class ProdottoNonAlimentare extends Prodotto {
    String materiale;
    
    public ProdottoNonAlimentare(String codice, String descrizione, double prezzo, String materiale){
        super(codice, descrizione, prezzo);
        this.materiale=materiale;
    }
    
    public String getMateriale(){
        return materiale;
    }
    
    public void setMateriale(String materiale){
        this.materiale=materiale;
    }
    
    public boolean isRiciclabile() {
       if(materiale.equalsIgnoreCase("vetro") || materiale.equalsIgnoreCase("carta") || materiale.equalsIgnoreCase("cotone")) return true;
       return false;
       
    }
    
    @Override
    public double applicaSconto(){
        
        double price=this.getPrezzo();
        
        if(this.isRiciclabile()) return price*0.9;
        return price;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nmateriale= " + materiale + "\nriciclabile= " + this.isRiciclabile() + "\n";
    }
    
}
