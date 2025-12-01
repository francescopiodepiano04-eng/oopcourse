/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedevice;
import java.util.Comparator;
/**
 *
 * @author angel
 */
public class DeviceReleaseDateComparator implements Comparator<Device>{
    
    @Override
    public int compare(Device o1, Device o2){
        
        int date=o1.getReleaseDate().compareTo(o2.getReleaseDate());
        if(date==0) return o1.compareTo(o2);
        return date;
        /*if(this.nome.equals(p.nome))
            return this.codiceFiscale.compareTo(p.codiceFiscale);
        return this.nome.compareTo(p.nome);*/
    }
}
