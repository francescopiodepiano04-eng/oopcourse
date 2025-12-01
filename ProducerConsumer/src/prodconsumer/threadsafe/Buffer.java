/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodconsumer.threadsafe;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author angel
 */
public class Buffer<E> {
    private Queue<E> buffer;
    private int size;
    
    public Buffer(int size){
        this.size=size;
        this.buffer=new LinkedList<>();
    }
    
    public synchronized boolean isFull(){
        return this.buffer.size()==size;
    }
    
    public synchronized boolean isEmpty(){
        return this.buffer.size()==0;
    }
    
    public synchronized void add(E element) throws InterruptedException{
        while(isFull()){
            wait();
        }
        
        this.buffer.add(element);
        //System.out.println(Thread.currentThread().getName()+" ha inserito "+element);
        notifyAll();
    }
    
    public synchronized E remove() throws InterruptedException{
        while(isEmpty()){
            wait();
        }
        notifyAll();
        return this.buffer.remove();
    }
}
