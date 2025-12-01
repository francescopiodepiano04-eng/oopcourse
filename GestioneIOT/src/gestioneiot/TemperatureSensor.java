/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneiot;
import java.time.LocalDate;
import gestioneiot.eccezioni.BadArgumentsForSensorTypeException;
/**
 *
 * @author angel
 */
public class TemperatureSensor extends Sensor{
    private final double tempResolution;
    private final double tempError;
    private final int bits;
    private final double outputSensitivity;
    
    
    
    public TemperatureSensor(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manufacturingDate, double tempResolution, double tempError, int bits){
        super(partNumber, manufacturer, price, vs, sot, manufacturingDate);
        if(sot.equals(SensorOutputType.ANALOG)){
            throw new BadArgumentsForSensorTypeException("Argomento non valido.");
        }
        this.tempResolution=tempResolution;
        this.tempError=tempError;
        this.bits=bits;
        this.outputSensitivity=0.0;
    }
    
    
    public TemperatureSensor(String partNumber, String manufacturer, double price, Range<Double> vs, SensorOutputType sot, LocalDate manufacturingDate, double outputSensitivity, double tempError){
        super(partNumber, manufacturer, price, vs, sot, manufacturingDate);
        if(sot.equals(SensorOutputType.DIGITAL)){
            throw new BadArgumentsForSensorTypeException("Argomento non valido");
        }
        this.tempError=tempError;
        this.tempResolution=0.0;
        this.bits=0;
        this.outputSensitivity=outputSensitivity;
    }
    
    public double getTempResolution(){
        return tempResolution;
    }
    
    public int getBits(){
        return bits;
    }
    
    public double getTempError(){
        return tempError;
    }
    
    public double getOutputSensitivity(){
        return outputSensitivity;
    }

    @Override
    public boolean hasValidPartNumber() {
        String code = getPartNumber();
        if(code.length() == 6){
            return code.matches("^(AD\\d{4})$");
        }
        if(code.length() == 7){
            return code.matches("^(ADT\\d{4})$");
        }
        return false;
    }
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        if(getSot()==SensorOutputType.ANALOG){
            str.append("\n***Analog Temperature Sensor***").append("\nTemperature Error(Deg)= ").append(tempError).append("\nOutputSensitivity(mV/°C)= ").append(outputSensitivity).append(super.toString());
        }else if(getSot()==SensorOutputType.DIGITAL){
            str.append("\n***Digital Temperature Sensor***").append("\nTemperature Resolution(°/LSB)= ").append(tempResolution).append("\nTemperature Error(Deg)= ").append(tempError).append("\nBits= ").append(bits).append(super.toString());
        }
        return str.toString();
    }

    
    
    
}
