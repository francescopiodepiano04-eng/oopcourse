/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneiot;

import java.time.LocalDate;

/**
 *
 * @author angel
 */
public class Accelerometer extends Sensor{
    private final double range;
    private final int sensingAxis;
    private final double bandwidth;
    
    public Accelerometer(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manufacturingDate, double range, int sensingAxis, double bandwidth){
        super(partNumber, manufacturer, price, vs, sot, manufacturingDate);
        this.range=range;
        this.sensingAxis=sensingAxis;
        this.bandwidth=bandwidth;
    }
    
    public Accelerometer(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manufacturingDate, double range, double bandwidth){
        this(partNumber, manufacturer, price, vs, sot, manufacturingDate, range, 3, bandwidth);
    }
    
    public double getRange(){
        return range;
    }
    
    public int getSensingAxis(){
        return sensingAxis;
    }
    
    public double getBandwidth(){
        return bandwidth;
    }
    
    @Override
    public boolean hasValidPartNumber() {
        String code = getPartNumber();
        if(code.length()==7){
            return code.matches("^(ADXL\\d{3})$");
        }
        if(code.length()==9){
            return code.matches("^(ADIS\\d{5})$");
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "\n***Accelerometer***" + "\nRange(g)= " + range + "\nNumber of Axis= " + sensingAxis + "\nBandwidth(kHz)= " + bandwidth + super.toString();
    }
    
}
