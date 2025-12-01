/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneunisa;

import it.unisa.diem.oop.eccezioni.AccessibileException;
import it.unisa.diem.oop.eccezioni.AccessibilePienoException;
import it.unisa.diem.oop.eccezioni.AccessibileVuotoException;
import it.unisa.diem.oop.persone.Docente;
import it.unisa.diem.oop.persone.Persona;
import it.unisa.diem.oop.persone.Studente;
import it.unisa.diem.oop.persone.PersoneUnisa;
import it.unisa.diem.oop.persone.StudenteErasmus;
import it.unisa.diem.oop.spazi.Accessibile;
import it.unisa.diem.oop.spazi.Aula;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class MainSpazi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AccessibileException {
        // TODO code application logic here
        Persona p=new Persona("Mario", "Rossi", "MRS0001");
        Studente s = new Studente("Ernesto", "Grigi", "ERG0001", "0612700002", 28.5F);
        StudenteErasmus se=new StudenteErasmus("Andrew", "James", "ANJ0001", "061270005", 9.0F);
        Docente d=new Docente("Enrico", "Bianchi", "ERB0001", "325600", "ASD");
        PersoneUnisa pu=s;
       
        
        
        Aula a=new Aula("A", 3);
        //il blocco try-catch va a provare l'esecuzione di un metodo, se c'è un eccezione la cattura e da un riferimento: ex
        a.entra(p); //Logger.getLogger(MainSpazi.class.getName()).log(Level.SEVERE, null, ex);
        a.entra(s);
        a.entra(se);
        
        //a.esce();
        a.entra(d);
        a.esce();
        a.esce();
        a.entra(d);
        System.out.println("Sto in finally.");
        Accessibile ae=a;
        ae.entra(p);
        System.out.println(a);
    }
    
}
