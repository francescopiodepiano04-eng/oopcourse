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
public class Main {

    /**
     * @param args the command line arguments
     */
    
    int x;  //attributo della classe main
    
    static int y;
    
    
    public static void main(String[] args) {   //entry point dell'applicazione 
        // TODO code application logic here
        Main m = new Main();
        m.x = 3;
        y = 4;
        
        int a;
        
        a=1;
        
        //p=new Prodotto(); //metodo costruttore
        
        //p.codice=1;
        //p.descrizione="Tavolo";
        //System.out.println(a);
        
        Prodotto p;
        p = new Prodotto(10, "Tavolo", 13.5F,"2025-06-01");
        
        
        p.stampaInfo();
        
        
        //System.out.println(p.codice);
        //System.out.println(p.descrizione);
        System.out.println(p.getNumProdotti());
        
        Prodotto p1=new Prodotto();
        
        
        //p1.setCodice(2);
        p1.setDescrizione("Penna");
        p1.setCosto(2.0F);
        p1.setDataProduzione("2024-04-03");
        System.out.println(p.getNumProdotti());
        
        
        
        Prodotto p2 = new Prodotto();
        
        //p2=null;
        
        //p2.setCodice(16);
        
        
        System.out.println(p.getNumProdotti());
        
        p.stampaInfo();
        p1.stampaInfo();
        
        p2.stampaInfo();
        
        
        
    }
    
}
