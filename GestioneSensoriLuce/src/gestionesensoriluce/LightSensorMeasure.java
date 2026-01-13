/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesensoriluce;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author angel
 */
public class LightSensorMeasure implements Comparable<LightSensorMeasure>{
    // Attributi
    private final LocalDateTime time;
    private final double value;
    private final int sensorId;
    

    // Costruttore
    public LightSensorMeasure(LocalDateTime time, double value, int sensorId){
        this.time=time;
        this.value=value;
        this.sensorId=sensorId;
    }
    

    // Getter
    public LocalDateTime getTime(){
        return time;
    }
    
    public double getValue(){
        return value;
    }
    
    public int getSensorId(){
        return sensorId;
    }
    
    
    // Override dei metodi
    
    @Override
    public String toString(){
        return "Time: "+time+", Value(lux): "+value+", Sensor ID: "+sensorId+"\n";
    }

    @Override
    public int compareTo(LightSensorMeasure o) {
        int c = Integer.compare(this.sensorId, o.sensorId);
        if(c==0) return this.time.compareTo(o.time);
        return c;
    }
}
