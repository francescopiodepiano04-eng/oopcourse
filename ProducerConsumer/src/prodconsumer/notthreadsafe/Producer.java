/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodconsumer.notthreadsafe;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class Producer implements Runnable{
    private Buffer<String> buffer;
    private int periodo;
    
    public Producer(Buffer<String> buffer, int periodo){
        this.buffer=buffer;
        this.periodo=periodo;
    }

    @Override
    public void run() {
        Random n = new Random(12500);
        while(!Thread.currentThread().isInterrupted()){
            
            try {
                Thread.sleep(periodo);
                String msg = "Info " + n.nextInt(10);
                synchronized(buffer){
                    while(buffer.isFull()){
                        buffer.wait();
                    }
                    buffer.add(msg);
                    System.out.println(Thread.currentThread().getName()+" ha inserito "+msg);
                    buffer.notifyAll();
                }
                
            } catch (InterruptedException ex) {
                return;
            }
        }
    }
}
