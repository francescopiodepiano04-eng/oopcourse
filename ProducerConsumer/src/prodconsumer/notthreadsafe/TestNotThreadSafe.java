/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodconsumer.notthreadsafe;



/**
 *
 * @author angel
 */
public class TestNotThreadSafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buffer<String> buffer = new Buffer<>(3);
        Thread t1 = new Thread(new Producer(buffer, 1000));
        Thread t2 = new Thread(new Consumer(buffer, 3000));
        Thread t3 = new Thread(new Consumer(buffer, 2000));
        
        t1.setName("Producer 1");
        t2.setName("Consumer 1");
        t3.setName("Consumer 2");
        
        t1.start();
        t2.start();
        t3.start();
        
        try {
            Thread.sleep(20000);
        } catch (InterruptedException ignored) {
        }
        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
        
    }
    
}
