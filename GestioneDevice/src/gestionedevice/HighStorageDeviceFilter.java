/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedevice;

/**
 *
 * @author angel
 */
public class HighStorageDeviceFilter implements DeviceFilter{
    private final int minSize;
    
    public HighStorageDeviceFilter(int minSize){
        this.minSize=minSize;
    }
    
    public int getMinSize(){
        return minSize;
    }
    
    
    @Override
    public boolean checkDevice(Device d) {
        return d.getRAMsize()>=minSize;
    }
    
}
