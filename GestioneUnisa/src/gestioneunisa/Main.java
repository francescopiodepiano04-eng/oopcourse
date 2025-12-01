/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
Studente
-nome, cognome, codiceFiscale, matricola, votoMedio
Docente
-nome, cognome, codiceFiscale, matricola, insegnamento
Tecnico
-nome, cognome, codiceFiscale, matricola, dipartimento
*/

package gestioneunisa;
import it.unisa.diem.oop.persone.*;

/**
 *
 * @author angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p=new Persona("Mario", "Rossi", "MRS0001");
        
        //superclasse Object
        //ogni oggetto ha bisogno di una rappresentazione su stringa con il metodo toString()
        //System.out.println(p.toString());
        
        
        //classe astratta
        //PersoneUnisa p1=new PersoneUnisa("Luigi", "Bianchi", "LGB0001", "061270001");
        
        //System.out.println(p1.toString());
        
        
        Studente s = new Studente("Ernesto", "Grigi", "ERG0001", "0612700002", 28.5F);
        //System.out.println(s);
        
        StudenteErasmus se=new StudenteErasmus("Andrew", "James", "ANJ0001", "061270005", 11.0F);
        //System.out.println(se);
        
        Docente d=new Docente("Enrico", "Bianchi", "ERB0001", "325600", "ASD");
        //System.out.println(d);
        //System.out.println(p.getNome());
        
        Persona p2 = s;
        //System.out.println(p2.toString());
        //Studente s2=(Studente)p;
        //System.out.println(s2.getVotoMedio());
        
        Persona persone[]=new Persona[3];
        
        persone[0]=p;
        persone[1]=s;
        persone[2]=d;
        
        for(int i=0; i<persone.length; i++){
            System.out.println(persone[i].toString());
            
            
            if(persone[i] instanceof Studente){
                Studente sx = (Studente)persone[i];
                System.out.println("-------STAMPA VOTO------:" + sx.getVotoMedio());
            }
            
            
        }
        Integer i = new Integer(3); //classi wrapper per variabili di tipo primitivo
        
        int b=Integer.parseInt("10");
    }
    
}
