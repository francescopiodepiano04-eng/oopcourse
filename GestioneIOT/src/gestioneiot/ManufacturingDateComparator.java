/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneiot;
import java.util.Comparator;
/**
 *
 * @author angel
 */
public class ManufacturingDateComparator implements Comparator<Sensor> {
    @Override
    public int compare(Sensor o1, Sensor o2){
        int comp=o1.getManufacturingDate().compareTo(o2.getManufacturingDate());
        if(comp!=0){
            return comp;
        }
        return o1.compareTo(o2);
    }
}
