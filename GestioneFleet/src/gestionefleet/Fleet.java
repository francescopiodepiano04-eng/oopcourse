/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefleet;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author angel
 */
public class Fleet {
    private final String name;
    private Set<Truck> fleet;
    
    public Fleet(String name){
        this.name=name;
        this.fleet=new HashSet<>();
    }
    
    public void add(Truck t){
        fleet.add(t);
    }
    
    public Fleet filterFoodGrade(){
        Fleet filtered = new Fleet("filtered"+this.name);
        Tanker tmp;
        for(Truck t : fleet){
            if(t instanceof Tanker){
                tmp=(Tanker)t;
                if(tmp.isFoodGrade()){
                    filtered.add(tmp);
                }
            }
        }
        return filtered;
    }
    
    @Override
    public String toString(){
        StringBuffer buf = new StringBuffer(name);
        buf.append(" contains:\n[");
        boolean notFirst = false;

        for( Truck t : fleet ) {
            if( notFirst ) {
                buf.append(",");
            }

            buf.append("\n");
            buf.append(t.toString());
            notFirst = true;

        }

        buf.append("]");
        return buf.toString();    }
}
