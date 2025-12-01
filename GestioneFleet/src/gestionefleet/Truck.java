/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefleet;
import java.time.LocalDate;
/**
 *
 * @author angel
 */
public class Truck {
    private final String numTelaio;
    private final LocalDate dataImmatricolazione;
    
    public Truck(String numTelaio, LocalDate dataImmatricolazione){
        this.numTelaio=numTelaio;
        this.dataImmatricolazione=dataImmatricolazione;
    }
    
    public String getNumTelaio() {
       return numTelaio;
    }

    public LocalDate getDataImmatricolazione() {
        return dataImmatricolazione;
    }
    

    @Override
    public int hashCode() {
        int c = this.getNumTelaio()==null ? 0 : numTelaio.hashCode();
        return c;
    }

    @Override
    public boolean equals(Object o) {
       if(o==null) return false;
       if(this==o) return true;
       if(!(o instanceof Truck)) return false;
       
       Truck t = (Truck) o;
       return this.numTelaio.equals(t.getNumTelaio());
   }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Truck{numTelaio=").append(numTelaio).append(", dataImmatricolazione=").append(dataImmatricolazione).append("}");
        return str.toString();
    }
    
}
