/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionemagazzino;

/**
 *
 * @author angel
 */
public class MainTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int v[];  //dichiarazione array
        
        v = new int[3];  //istanzio un array di 3 interi
        
        v[1] = 3;
        
        for(int i = 0; i < v.length; i++){
            
            System.out.println(v[i]);
        }
        
        //Tipi Riferimento
        
        Prodotto prodotti[];
        
        prodotti = new Prodotto[3];
        
        prodotti[0]=new Prodotto("Tavolo", 30.0F, "2024-06-01");
        prodotti[1]=new Prodotto("Penna", 3.0F, "2024-05-01");
        prodotti[2]=new Prodotto("Microfono", 30.0F, "2023-06-01");
        String nomiProdotto="";
        StringBuffer nomiProdottoBuffer = new StringBuffer();
        for(int i = 0; i < v.length; i++){
            
            //prodotti[i].stampaInfo();
            
            //nomiProdotto+= prodotti[i].getDescrizione();     //esempio concatenazione stringhe
            nomiProdottoBuffer.append(prodotti[i].getDescrizione());
            
            
        }
        System.out.println(nomiProdottoBuffer);
        
       /* for(Prodotto p : prodotti){   //foreach scorre fino alla lunghezza fisica è un tipo di for sconsigliato
            
            p.stampaInfo();
        }*/
        
        String s = "Tavolo";
        String s2 = "Microfono";
        
        s2 = "Penna";
        
        
        
        
        String s1 = new String("Penna");
        
        boolean test = s.equals(s2);
        
        System.out.println(test);
        
        
        
        
    }
    
}
