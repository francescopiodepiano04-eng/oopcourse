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
public class NotebookFilter implements DeviceFilter{

    @Override
    public boolean checkDevice(Device d) {
        return (d instanceof Notebook);
    }
    
}
