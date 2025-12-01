/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodconsumer.threadsafe;


import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author angel
 */
public class Producer implements Runnable{
    private int periodo;
    private Buffer<String> buffer;
    
    public Producer(Buffer<String> buffer, int periodo){
        this.periodo=periodo;
        this.buffer=buffer;
    }

    @Override
    public void run() {
        Random n = new Random(12400);
        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(periodo);
                String msg = "Info "+n.nextInt();
                buffer.add(msg);
                System.out.println(Thread.currentThread().getName()+" ha inserito "+msg);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
