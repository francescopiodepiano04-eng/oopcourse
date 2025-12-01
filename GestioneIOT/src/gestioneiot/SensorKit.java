/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneiot;
import java.lang.Iterable;
import java.util.List;
import java.util.ArrayList;
import gestioneiot.eccezioni.BadSensorPartNumberException;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
/**
 *
 * @author angel
 */
public class SensorKit implements Filterable, Iterable<Sensor> {
    private final String name;
    private final List<Sensor> kit;
    
    public SensorKit(String name){
        this.name=name;
        this.kit=new ArrayList<>();
    }
    
    public void add(Sensor s) throws BadSensorPartNumberException{
        if(!s.hasValidPartNumber()){
            throw new BadSensorPartNumberException("PartNumber invalid");
        }
        kit.add(s);
    }
    
    public void remove(Sensor s){
        kit.remove(s);
    }
    
    public void sort(Comparator<Sensor> c){
        if(c==null){
            Collections.sort(kit);
        }else{
            kit.sort(c);
        }
    }
    
    @Override
    public Iterator<Sensor> iterator(){
        return kit.iterator();
    }
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("This ").append(name).append(" contains ").append(kit.size()).append(" sensors: \n");
        for(Sensor s : kit){
            str.append(s.toString()).append("\n");
        }
        return str.toString();
    }
    
    @Override
    public SensorKit filter(SensorFilter sf, Comparator<Sensor> c){
        SensorKit filtered = new SensorKit("filter"+this.name);
        for(Sensor s : this.kit){
            if(sf.checkSensor(s)){
                try{
                    filtered.add(s);
                }catch(BadSensorPartNumberException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
        filtered.sort(c);
        return filtered;
    }
}
