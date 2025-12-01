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
public class GuadagnaGuadagna implements Runnable{

    private final ContoCurrent c;
    private final int periodo;
    
    public GuadagnaGuadagna(ContoCurrent c, int periodo){
        this.c=c;
        this.periodo=periodo;
    }
    
    @Override
    public void run() {
        Random n = new Random(23400);
        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(periodo);
            } catch (InterruptedException ex) {
                return;
                //Logger stampa perchè ha sollevato l'eccezione ma il thread deve essere fermato
            }
            
            //synchronized(c){
                int importo = (n.nextInt(19)+1)*50;
                c.versa(importo);
                System.out.println(Thread.currentThread().getName()+" ha versato: "+importo+" nuovo saldo: "+c.getSaldo());
            //}
        }
    }
    
}
