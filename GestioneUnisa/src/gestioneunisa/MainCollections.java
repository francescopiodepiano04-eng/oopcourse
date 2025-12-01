/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneunisa;


import it.unisa.diem.oop.persone.*;
import java.util.*;


/**
 *
 * @author angel
 */
public class MainCollections {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p=new Persona("Mario", "Rossi", "ERS0001");
        Persona p2=new Persona("Maria", "Rossi", "MRS0002");
        //Object p3=p.clona();
        Persona p4=p.clona();
        Studente s = new Studente("Ernesto", "Grigi", "ERG0001", "0612700002", 28.5F);
        StudenteErasmus se=new StudenteErasmus("Andrew", "James", "ANJ0001", "061270005", 9.0F);
        Docente d=new Docente("Enrico", "Bianchi", "XRB0001", "325600", "ASD");
        
        
        boolean test=p.equals(p4);
        
        boolean test2=p.equals(p2);
        
        //Collection<String> c=new ArrayList<String>();
        //List<String> c=new ArrayList<String>();
        System.out.println("***LISTA***");
        List<String> c = new ArrayList<>();
        
        c.add("Mario");
        c.add("Mario");
        c.add("Luigi");
        //String n2=c.get(2); //valido per list
        
        for(String nome : c){
            System.out.println(nome);
        }
        //System.out.println(n2);
        System.out.println("******");
        //System.out.println(test);
        Iterator<String> i = c.iterator();
        while(i.hasNext()){
            String corrente=i.next();
            
            System.out.println(corrente);
        }
         
        System.out.println("***HASHSET***");
        Set<Persona> persone = new HashSet<>();
        
        persone.add(p);
        
        persone.add(p4);
        persone.add(p2);
        persone.add(s);
        
        System.out.println(persone);
        
        System.out.println("***TREESET***");  //usa il compare to e non l'equals
        Set<String> s1 = new TreeSet<>();
        
        s1.add("Mario");
        s1.add("Mario");
        s1.add("Adele");
        s1.add("Luca");
        
        
        System.out.println(s1);
        
        Set<Persona> sp = new TreeSet<>(new CustomComparator());
        sp.add(p);
        sp.add(p4);
        sp.add(p2);
        sp.add(s);
        sp.add(se);
        
        sp.add(d);
        
        System.out.println(sp);
        
        
        /*System.out.println("==== FASE DI TEST ====");
        List <Object> h = new ArrayList <>();
        h.add("1");
        h.add('2');
        h.add(null);
        while(h.iterator().hasNext()){
            System.out.println(h.iterator().next());
        }*/
        
    }
    //LocalDate.now().isAfter()
    
    
    
}
