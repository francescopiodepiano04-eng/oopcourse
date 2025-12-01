/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneunisa;

import it.unisa.diem.oop.persone.Studente;
import it.unisa.diem.oop.report.AnagraficaStudenti;
import java.io.IOException;

/**
 *
 * @author angel
 */
public class MainReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        AnagraficaStudenti a = new AnagraficaStudenti("OOP");
        
        Studente s1 = new Studente("Ernesto", "Grigi", "ERG0001", "0612700001", 28.5F);
        Studente s2 = new Studente("Luigi", "Grigi", "ERG0001", "0612700002", 28.5F);
        Studente s3 = new Studente("Mario", "Grigi", "ERG0001", "0612700003", 28.5F);
        Studente s4 = new Studente("Davide", "Grigi", "ERG0001", "0612700004", 28.5F);
        
        a.aggiungi(s1);
        a.aggiungi(s2);
        a.aggiungi(s3);
        a.aggiungi(s4);
        
        System.out.println(a);
        
        //a.salvaDOS("anagrafica.bin");
        
        //AnagraficaStudenti a2 = AnagraficaStudenti.leggiDIS("anagrafica.bin");
        //System.out.println(a2);
        //a.salvaOBJ("anagrafica.obj");
        
        //AnagraficaStudenti a3 = AnagraficaStudenti.leggiOBJ("anagrafica.obj");
        //System.out.println(a3);
        
        //a.salvaCSV("anagrafica.csv");
        
        //AnagraficaStudenti a4 = AnagraficaStudenti.leggiCSV("anagrafica.csv");
        //System.out.println(a4);
        
        AnagraficaStudenti a5 = AnagraficaStudenti.leggiCSVScan("anagrafica.csv");
        System.out.println(a5);
    }
    
}
