/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneiot;
import java.lang.Comparable;
import java.time.LocalDate;
/**
 *
 * @author angel
 */
public abstract class Sensor implements Comparable<Sensor>{
    private final String partNumber;
    private final String manufacturer;
    private final double price;
    private final Range<Double> vs;
    private final SensorOutputType sot;
    private final LocalDate manufacturingDate;
    
    public Sensor(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manufacturingDate){
        this.partNumber=partNumber;
        this.manufacturer=manufacturer;
        this.price=price;
        this.vs=vs;
        this.sot=sot;
        this.manufacturingDate=manufacturingDate;
        
    }
    
    
    public String getPartNumber(){
        return partNumber;
    }
    
    public Range<Double> getVs(){
        return vs;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public double getPrice(){
        return price;
    }
    
    public SensorOutputType getSot(){
        return sot;
    }
    
    public LocalDate getManufacturingDate(){
        return manufacturingDate;
    }
    
    
    @Override
    public boolean equals(Object other){
        if(other==null) return false;
        if(this==other) return true;
        if(this.getClass()==other.getClass()) return true;
        
        Sensor s = (Sensor) other;
        if(this.partNumber.equals(s.partNumber)) return true;
        return false;
    }
    
    
    @Override
    public int hashCode(){
        int c = partNumber == null ? 0 : partNumber.hashCode();
        return c;
    }
    
    @Override
    public int compareTo(Sensor o){
        return this.partNumber.compareTo(o.partNumber);
        
    }
    
    
    public abstract boolean hasValidPartNumber();
    
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("\nPart Number= ").append(partNumber).append("\nManufacturer= ").append(manufacturer).append("\nPrice($)= ").append(price).append("\nSource voltage range (V)= ").append(vs).append("\nOutput Type= ").append(sot).append("\nManifacturing Date= ").append(manufacturingDate);
        return str.toString();
        
    }
    
    
    
}
