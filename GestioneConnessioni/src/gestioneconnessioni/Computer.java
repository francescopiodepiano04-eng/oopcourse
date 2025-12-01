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
public class Computer extends NetworkDevice {
    private final String name;
    
    public Computer(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }

    @Override
    protected void process(int sourceAddress, String message) {
        System.out.println("Device " + this.getAddress() + ": Computer " + name + "ha ricevuto da " + sourceAddress + ": " + message);
    }
    
    public void remoteFileAccessRequest(int serverAddress, String fileName) {
        if (getConnection() == null) {
            throw new NetworkException("Dispositivo non connesso");
        }
        String message = "Accesso a " + fileName;
        this.getConnection().accept(this, getAddress(), serverAddress, message);
    }
    
    
    public void remotePrintRequest(int printerAddress, String fileName){
        if(this.getConnection()==null){
            throw new NetworkException("Dispositivo non connesso");
        }
        String message = "Richiesta di stampa di " + fileName;
        this.getConnection().accept(this, getAddress(), printerAddress, message);
    }
    
    @Override
    public String toString(){
        return super.toString() + ": Computer " + name;
    }
    
    
}
