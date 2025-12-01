/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedevice;
import java.util.Comparator;
import java.util.Set;
/**
 *
 * @author angel
 */
public interface Filterable {
    DeviceStore filter(DeviceFilter d, Comparator<Device> c);
}
