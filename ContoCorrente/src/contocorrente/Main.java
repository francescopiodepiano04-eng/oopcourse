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
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ContoCurrent c = new ContoCurrent(1000);
        
        Thread t1 = new Thread(new GuadagnaGuadagna(c, 3000));
        Thread t2 = new Thread(new SpendiSpendi(c, 1000));
        Checker check = new Checker(500);
        
        check.add(t1);
        check.add(t2);
        
        Thread t3 = new Thread(check);
        t3.start();
        
        t1.setName("GuadagnaGuadagna");
        t2.setName("SpendiSpendi");
        
        t1.start();
        
        t1.join();
        
        t2.start();
        
        Thread.sleep(10000);
        
        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
        
    }
    
}
