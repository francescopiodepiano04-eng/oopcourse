/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodconsumer.threadsafe;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class Consumer implements Runnable{
    private int periodo;
    private Buffer<String> buffer;
    
    public Consumer(Buffer<String> buffer, int periodo){
        this.periodo=periodo;
        this.buffer=buffer;
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            try{
                Thread.sleep(periodo);
                String msg = buffer.remove();
                System.out.println(Thread.currentThread().getName()+" ha prelevato"+msg);
            }catch(InterruptedException ex){
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
