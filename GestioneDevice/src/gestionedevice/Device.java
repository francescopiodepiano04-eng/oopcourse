/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedevice;
import java.time.LocalDate;
/**
 *
 * @author angel
 */
public abstract class Device implements Comparable<Device>{
    private final String serialNumber;
    private final LocalDate releaseDate;
    private final int RAMsize;
    private final int storageCapacity;
    
    public Device(String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity){
        this.serialNumber=serialNumber;
        this.releaseDate=LocalDate.of(year, month, dayOfMonth);
        this.RAMsize=RAMsize;
        this.storageCapacity=storageCapacity;
    }
    
    public String getSerialNumber(){
        return serialNumber;
    }
    
    public LocalDate getReleaseDate(){
        return releaseDate;
    }
    
    public int getRAMsize(){
        return RAMsize;
    }
    
    public int getStorageCapacity(){
        return storageCapacity;
    }
    
    @Override
    public int hashCode(){
        int code = serialNumber == null ? 0 : this.hashCode();
        return code;
    }
    
    @Override
    public boolean equals(Object other){
        if(other==null) return false;
        if(this==other) return true;
        if(!(other instanceof Device)) return true;
        
        Device d = (Device) other;
        if(this.serialNumber.equals(d.serialNumber)) return true;
        return false;
    }
    
    
    @Override
    public int compareTo(Device o){
        return this.serialNumber.compareTo(o.serialNumber);
    }
    
    public abstract boolean hasTouchScreen();
    
    @Override
    public String toString(){
        return "\nserialNumber= " + serialNumber + "\nreleaseDate= " + releaseDate + "\nRAMsize= " + RAMsize + "\nstorageCapacity= " + storageCapacity;
    }
}
