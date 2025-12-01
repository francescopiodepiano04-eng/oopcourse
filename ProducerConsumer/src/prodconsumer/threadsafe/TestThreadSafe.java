/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodconsumer.threadsafe;

/**
 *
 * @author angel
 */
public class TestThreadSafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Buffer<String> buffer = new Buffer<>(3);
        
        Thread p1 = new Thread(new Producer(buffer, 2000));
        Thread c1 = new Thread(new Consumer(buffer, 1000));
        Thread c2 = new Thread(new Consumer(buffer, 1500));
        
        p1.setName("Producer 1");
        c1.setName("Consumer 1");
        c2.setName("Consumer 2");
        
        p1.start();
        c1.start();
        c2.start();
        
        Thread.sleep(20000);
        p1.interrupt();
        c1.interrupt();
        c2.interrupt();
    }
    
}
