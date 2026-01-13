/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneesami;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class LibrettoEsami implements Serializable{
    private Map<String, LinkedList<EsameSuperato>> libretto;
    private static int cont=0;
    
    public LibrettoEsami(){
        this.libretto=new TreeMap<>();
    }
    
    public void aggiungi(EsameSuperato s){
        if(libretto.containsKey(s.getNomeInsegnamento())){
            LinkedList lib = libretto.get(s.getNomeInsegnamento());
            lib.add(s);
        }else{
            LinkedList<EsameSuperato> lib = new LinkedList<>();
            lib.add(s);
            libretto.put(s.getNomeInsegnamento(), lib);
        }
    }
    
    public LibrettoEsami readFile(String filename) throws IOException{
        FileReader reader = new FileReader(filename);
        LibrettoEsami libretto = new LibrettoEsami();
        EsameSuperato es;
        Scanner s = new Scanner(reader);
        s.useDelimiter(",|\\n");
        
        while(s.hasNext()){
            es = new EsameSuperato(s.next(), LocalDate.parse(s.next()), s.next(), Integer.parseInt(s.next()));
            libretto.aggiungi(es);
        }
        return libretto;
    }
    
    public void stampaInsegnamento(){
        String s = "Esami presenti nel libretto: " + cont + "\nElenco:\n";
        System.out.println(s);
        for(Map.Entry<String,LinkedList<EsameSuperato>> b : libretto.entrySet()){
            System.out.println(b.getValue());
        }
    }
    
    public void stampInsegnamento(String insegnamento){
        for(Map.Entry<String, LinkedList<EsameSuperato>> m: libretto.entrySet()){
            if(m.getKey().equals(insegnamento)){
                System.out.println(m.getValue());
            }
        }
    }
    
    public void stampMatricola(String matricola){
        for(Map.Entry<String, LinkedList<EsameSuperato>> m: libretto.entrySet()){
            for(EsameSuperato es: m.getValue()){
                if(es.getMatricolaStudente().equals(matricola)) System.out.println(es);
            }
        }
    }
    
    public void salvaOBJ(String filename) throws IOException{
        FileOutputStream fos = new FileOutputStream(filename);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        try{
            oos.writeObject(this);
            
        } catch (IOException ex) {
            Logger.getLogger(LibrettoEsami.class.getName()).log(Level.SEVERE, null, ex);
        }        
        oos.close();
    }
    
    public LibrettoEsami leggiOBJ(String filename) throws IOException, ClassNotFoundException{
        LibrettoEsami l = null;
        
        FileInputStream fis = new FileInputStream(filename);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        
        try{
            l=(LibrettoEsami) ois.readObject();
        }catch(IOException ex){
            Logger.getLogger(LibrettoEsami.class.getName()).log(Level.SEVERE, null, ex);
        }
        ois.close();
        return l;
    }
    
    
}
