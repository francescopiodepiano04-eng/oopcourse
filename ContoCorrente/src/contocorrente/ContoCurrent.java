/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contocorrente;

/**
 *
 * @author angel
 */
public class ContoCurrent {
    private double saldo;
    
    public ContoCurrent(double saldo){
        this.saldo = saldo;
    }
    
    public synchronized double getSaldo(){
        return this.saldo;
    }
    
    public void versa(double importo){
        if(importo <= 0) throw new RuntimeException("Non è possibile versare: " + importo); 
        synchronized(this){
            saldo += importo;
        }
    }
    
    public synchronized void prelievo(double importo){
        if(importo <= 0 || importo>saldo) throw new RuntimeException("Non è possibile prelevare: " + importo);
        saldo-=importo;
    }
}
