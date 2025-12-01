/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneconnessioni;

import gestioneconnessioniException.NetworkException;

/**
 *
 * @author angel
 */
public class FileServer extends NetworkDevice {
    
    
    

    @Override
    protected void process(int sourceAddress, String message) {
        System.out.println("Device " + getAddress() + ": File Server: su richiesta di " + sourceAddress + ": " + message);
        
        if(getConnection() == null){
            throw new NetworkException("Dispositivo non connesso");
        }
        
        String response = "Dati risposta: " + message;
        getConnection().accept(this, getAddress(), sourceAddress, response);
    }
    
    @Override
    public String toString(){
        return super.toString() + ": File Server";
    }
    
}
