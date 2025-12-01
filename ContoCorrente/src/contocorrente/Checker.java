/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contocorrente;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class Checker implements Runnable{
    private Set<Thread> threads;
    private int period;
    
   public Checker(int period){
       this.period=period;
       this.threads= new HashSet<>();
   }
   
   public void add(Thread t){
       threads.add(t);
   }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            for(int i=0; i<3; i++){
                try {
                    Thread.sleep(period);
                } catch (InterruptedException ex) {
                    return;
                }
                for(Thread t: threads){
                    System.out.println(t.getName()+" : " + t.getState());
                }
            }
        }
    }
   
   
}
