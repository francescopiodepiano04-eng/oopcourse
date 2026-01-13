/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneristorante;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import java.util.Queue;

/**
 *
 * @author angel
 */
public class Comande {
    private String filename;
    private Queue<Ordinazione> buffer;
    
    public Comande(String filename, boolean leggiBackup) throws IOException{
        Queue<Ordinazione> queue=null;
        if(leggiBackup){
            try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))){
                queue=(Queue<Ordinazione>) ois.readObject();
            }catch(ClassNotFoundException ex){
                System.err.println(ex.getMessage());
            }
            this.buffer=queue;
        }else{
            this.buffer=new LinkedList<>();
        }
        this.filename=filename;
    }
    
    public synchronized void aggiungiOrdinazione(Ordinazione ordinazione){
        this.buffer.add(ordinazione);
        notifyAll();
    }
    
    public synchronized Ordinazione consegnaOrdinazione() {
        while(this.buffer.isEmpty()){
            try{
                wait();
            }catch(InterruptedException ex){
                System.err.println("Interrupted while waiting!");
            }
        }
        //notifyAll();
        return this.buffer.remove();
    }
    
    public synchronized void salvaOrdinazioni() throws IOException{
        while(buffer.isEmpty()){
            try{
                wait();
            }catch(InterruptedException ex){
                System.err.println("Interrupted while waiting!");
            }
        }
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))){
            oos.writeObject(buffer);
        }
    }
}
