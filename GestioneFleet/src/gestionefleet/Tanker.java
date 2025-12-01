/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefleet;
import gestionefleet.eccezioni.IllegalArgumentException;

public class Tanker extends Truck {
    
    private final int totalCapacity;
    private final int compartments;
    private final boolean foodGrade;
    

    public Tanker(Truck tractor, int totalCapacity, int compartments, boolean foodGrade) {
        super(tractor.getNumTelaio(), tractor.getDataImmatricolazione());
        
        if((totalCapacity<5000 || totalCapacity > 25000) || compartments > 4){
            throw new IllegalArgumentException("Invalid total capacity value or bad compartments number");
        }
        this.compartments=compartments;
        this.totalCapacity=totalCapacity;
        this.foodGrade=foodGrade;
    }
   

    public int getTotalCapacity() {
       return totalCapacity;
    }

    public int getCompartments() {
        return compartments;
    }

    public boolean isFoodGrade() {
        return foodGrade;
    }
    
    

    @Override
    public String toString() {
       StringBuffer buf = new StringBuffer(super.toString());

        buf.append("->Tanker{totalCapacity=");
        buf.append(totalCapacity);
        buf.append(", compartments=");
        buf.append(compartments);
        buf.append(", foodGrade=");
        buf.append(foodGrade);
        buf.append("}");

        return buf.toString();
    }
}
