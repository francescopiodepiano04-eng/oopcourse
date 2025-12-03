/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodconsumer.notthreadsafe;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author angel
 */
public class Buffer<E> {
    private int size;
    private Queue<E> buffer;
    
    public Buffer(int size){
        this.size=size;
        this.buffer=new LinkedList<>();
    }
    
    public boolean isFull(){
        return this.buffer.size() == size;
    }
    
    public boolean isEmpty(){
        return this.buffer.size()==0;
    }
    
    public void add(E element){
        this.buffer.add(element);
    }
    
    public E remove(){
        return this.buffer.remove();
    }
    
    
}
