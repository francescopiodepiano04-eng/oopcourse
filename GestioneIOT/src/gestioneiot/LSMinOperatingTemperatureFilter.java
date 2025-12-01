/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneiot;

/**
 *
 * @author angel
 */
public class LSMinOperatingTemperatureFilter implements SensorFilter {
    private final double minTemperature;
    
    public LSMinOperatingTemperatureFilter(double minTemperature){
        this.minTemperature=minTemperature;
    }

    @Override
    public boolean checkSensor(Sensor s) {
        if(s instanceof LightSensor){
            LightSensor ls = (LightSensor) s;
            return ls.getOperatingTemperature().contains(minTemperature);
            
            
        }
        return false;
    }
    
}
