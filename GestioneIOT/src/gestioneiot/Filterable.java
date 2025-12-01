/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneiot;
import java.util.Comparator;
/**
 *
 * @author angel
 */
public interface Filterable {
    SensorKit filter(SensorFilter sf, Comparator<Sensor> c); //public abstract 
}
