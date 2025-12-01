/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contocorrente;

import java.util.Random;


/**
 *
 * @author angel
 */
public class SpendiSpendi implements Runnable{
    
    private ContoCurrent c;
    private int periodo;
    
    public SpendiSpendi(ContoCurrent c, int periodo){
        this.c=c;
        this.periodo=periodo;
    }

    @Override
    public void run() {
        Random n = new Random(12500);
        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(periodo);
            } catch (InterruptedException ex) {
                return;
            }
        }
        synchronized(c){
            int importo=(n.nextInt(19)+1)*50;
            c.prelievo(importo);
            System.out.println(Thread.currentThread().getName()+" ha prelevato: "+importo+" nuovo saldo: "+c.getSaldo());
        
        }
    }
    
}
