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
public class SourceVoltageFilter implements SensorFilter{
    private final double vs;
    public SourceVoltageFilter(double vs){
        this.vs=vs;
    }

    @Override
    public boolean checkSensor(Sensor s) {
        return s.getVs().contains(vs);
    }
    
}
