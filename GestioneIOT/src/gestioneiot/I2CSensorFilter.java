/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneiot;

import static gestioneiot.SensorOutputType.I2C;

/**
 *
 * @author angel
 */
public class I2CSensorFilter implements SensorFilter {

    @Override
    public boolean checkSensor(Sensor s) {
        return s.getSot().toString().equals(I2C);
    }
    
}
