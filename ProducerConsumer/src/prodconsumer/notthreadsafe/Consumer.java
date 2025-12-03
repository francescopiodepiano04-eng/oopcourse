/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodconsumer.notthreadsafe;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class Consumer implements Runnable{
    private Buffer<String> buffer;
    private int periodo;
    
    public Consumer(Buffer<String> buffer, int periodo){
        this.buffer=buffer;
        this.periodo=periodo;
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(periodo);
                synchronized(buffer){
                    while(buffer.isEmpty()){
                        buffer.wait();
                    }
                    System.out.println(Thread.currentThread().getName()+" ha letto: "+buffer.remove());
                    buffer.notifyAll();
                }
                
            } catch (InterruptedException ex) {
                return;
            }
        }
    }
    
    
}
