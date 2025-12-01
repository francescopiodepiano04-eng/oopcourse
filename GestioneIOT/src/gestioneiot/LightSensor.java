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
public class LightSensor extends Sensor{
    private final double wavelength;
    private final boolean proximityDetection;
    private final Range<Double> operatingTemperature;
    private final LightSensorType lst;
    
    public LightSensor(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manufacturingDate, double wavelength, boolean proximityDetection, Range<Double> operatingTemperature, LightSensorType lst){
        super(partNumber, manufacturer, price, vs, sot, manufacturingDate);
        this.wavelength=wavelength;
        this.proximityDetection=proximityDetection;
        this.operatingTemperature=operatingTemperature;
        this.lst=lst;
    }
    
    public LightSensor(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manufacturingDate, double wavelength, Range<Double> operatingTemperature, LightSensorType lst){
        this(partNumber, manufacturer, price, vs, sot, manufacturingDate, wavelength, false, operatingTemperature, lst);
    }
    
    public double getWaveLength(){
        return wavelength;
    }
    
    public boolean hasProximityDetection(){
        return proximityDetection;
    }
    
    public Range<Double> getOperatingTemperature(){
        return operatingTemperature;
    }
    
    public LightSensorType getLst(){
        return lst;
    }
    
    @Override
    public boolean hasValidPartNumber(){
        String code = getPartNumber();
        if(code.length()==11){
            return code.matches("^(APDS\\d{7})$");
        }
        if(code.length()==8){
            return code.matches("^(ADCL\\d{4})$");
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "\n***Ligth Sensor***" + "\nWavelength(nm)= " + wavelength + "\nProximityDetection= " + proximityDetection + "\nOperating Temperature(°C)= " + operatingTemperature + "\nLight Sensor Type= " + lst + super.toString();
    }
    
    
}
