/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedevice;

import java.util.Comparator;
import java.util.*;

/**
 *
 * @author angel
 */
public class DeviceStore implements Filterable{
    
    private final String name;
    private final Set<Device> store;
    private final Comparator<Device> c;
    
    
    public DeviceStore(String name){
        this.name=name;
        this.c=null;
        this.store = new TreeSet<>();
    }
    
    public DeviceStore(String name, Comparator<Device> c){
        this.name=name;
        this.c=c;
        if(c!=null){
            this.store = new TreeSet<>(c);
        }else{
            this.store=new TreeSet<>();
        }
    }
    
    public String getName(){
        return name;
    }
    
    public void addDevice(Device d) throws DeviceInsertionException {
        if(store.contains(d)){
            throw new DeviceInsertionException("Il device è già presente nello store");
        }
        store.add(d);
    }
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(name).append(" contains ").append(store.size()).append(" items.\n");
        str.append("Printing: \n");
        for(Device d: store){
            str.append(d);
            
            str.append("\n*****");
        }
        return str.toString();
    }

    
    @Override
    public DeviceStore filter(DeviceFilter d, Comparator<Device> c) {
        DeviceStore filteredStore;
        if (c != null) {
            filteredStore = new DeviceStore(name + " custom view", c);
        } else {
            // Se non viene specificato un comparatore, usa quello dello store originale o l'ordine naturale
            if (this.c!= null) {
                filteredStore = new DeviceStore(name + " custom view", this.c);
            } else {
                filteredStore = new DeviceStore(name + " custom view");
            }
        }

        for (Device device : store) {
            if(d.checkDevice(device)){
                try {
                    filteredStore.addDevice(device);
                } catch (DeviceInsertionException e){
                    //null
                }
            }
        }

        return filteredStore;
    }
    
}
