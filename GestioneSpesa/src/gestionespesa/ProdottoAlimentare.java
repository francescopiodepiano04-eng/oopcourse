/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionespesa;
import java.time.LocalDate;

/**
 *
 * @author angel
 */
public class ProdottoAlimentare extends Prodotto {
    private LocalDate dataScadenza;

    public ProdottoAlimentare(String codice, String descrizione, double prezzo, LocalDate dataScadenza) {
        super(codice, descrizione, prezzo);
        this.dataScadenza=dataScadenza;
    }
    
    public LocalDate getDataScadenza(){
       return dataScadenza;
    }
    
    public void setDataScadenza(LocalDate dataScadenza){
        this.dataScadenza=dataScadenza;
    }
    
    @Override
    public double applicaSconto(){
        double price=this.getPrezzo();
        
        LocalDate dataAttuale=LocalDate.now();
        if(dataAttuale.isAfter(this.dataScadenza.plusDays(10))) return price*0.8;
        return price;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\ndata di scadenza = " + dataScadenza + "\n";
    }
    
}
