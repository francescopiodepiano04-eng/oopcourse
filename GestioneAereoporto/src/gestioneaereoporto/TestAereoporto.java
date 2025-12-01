/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneaereoporto;

import gestioneaereoporto.interfacce.CodeChecker;

/**
 *
 * @author angel
 */
public class TestAereoporto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creazione di un vettore di aeromobili
        Aereomobile[] v = inizializzaAeromobili();
        
        // Test con Aeroporto senza CodeChecker
        System.out.println("\n\n\n======= Test n. 1 - Aeroporto senza CodeChecker =======\n");
        eseguiTest(null, v);

        // Test con Aeroporto con CodeChecker IT
        System.out.println("\n\n\n======= Test n. 2 - Aeroporto con CodeChecker IT =======\n");
        eseguiTest(new CodeCheckIT(), v);

        // Test con Aeroporto con CodeChecker EN
        System.out.println("\n\n\n======= Test n. 3 - Aeroporto con CodeChecker EN =======\n");
        eseguiTest(new CodeCheckEN(), v);
        
    }
    
    private static Aereomobile[] inizializzaAeromobili(){
        Aereomobile[] v = new Aereomobile[10];
        v[0] = new AereoAMotore("KL234", 4);
        v[1] = new AereoAMotore("ITmJ954", 2);
        v[2] = new AereoAMotore("EN66IO", 1);
        v[3] = new AereoAMotore("ITPPM22", 3);
        v[4] = new AereoAMotore("itIF671", 4);
        v[5] = new Aliante("IQ721", 0.34);
        v[6] = new Aliante("ITPO251", 0.26);
        v[7] = new Aliante("EN65IK", 0.44);
        v[8] = new Aliante("ITOL966", 0.16);
        v[9] = new Aliante("EN19UIK", 0.16);
        return v;
    }
    
    private static void eseguiTest(CodeChecker c, Aereomobile v[]){
        Aereoporto a;
        int inserimenti;
        String codiceRicerca, codiceCancellazione;
        Aereomobile cercato, eliminato;
        
        System.out.println("Test inserimenti");
        a = new Aereoporto(c);
        inserimenti = 0;
        for(int i=0; i<10; i++){
            if(a.inserisci(v[i]))
                inserimenti++;            
        }
        System.out.println("Sono stati effettuati n. " + inserimenti + " inserimenti");
        System.out.println("Elementi inseriti:\n" + a);
        
        System.out.println("Test ricerca");        
        codiceRicerca = "KL234";
        System.out.println("Ricerca in base al codice: " + codiceRicerca);
        cercato = a.cerca(codiceRicerca);
        if(cercato!=null)
            System.out.println("Aeromobile trovato: " + cercato);
        else
            System.out.println("Nessun aeromobile corrisponde al criterio di ricerca");
        
        System.out.println("\nTest cancellazione");
        codiceCancellazione = "EN65IK";
        System.out.println("Cancellazione codice: " + codiceCancellazione);
        eliminato = a.rimuovi(codiceCancellazione);
        if ( eliminato != null )
            System.out.println("Aeromobile eliminato: " + eliminato);
        else
            System.out.println("Nessun aeromobile corrisponde al criterio di ricerca");       
        System.out.println("Numero elementi residui: " + a.elementi());
    }
    
    
}
