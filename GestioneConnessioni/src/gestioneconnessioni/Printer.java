/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneconnessioni;

/**
 *
 * @author angel
 */
public class Printer extends NetworkDevice{

    @Override
    protected void process(int sourceAddress, String message) {
        System.out.println("Device " + getAddress() + ": Printer: Su richiesta di " + sourceAddress + ": " + message);
    }
    
    @Override
    public String toString(){
        return super.toString() + ": Printer";
    }
    
}
