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
public class Prodotto {
    
    //SPAZIO ATTRIBUTI
    
    private final int codice;   //tramite la keyword final, l'attributo diventa immutabile
    private String descrizione;
    private float costo;
    private String dataProduzione;
    private static int numProdotti;
    
    
    
    static{   //inizializzatore statico (invocato per primo)
        //numProdotti = 1;
    }
    
    
    //inizializzatore normale o di istanza (invocato prima del costruttore ad ogni creazione di una nuova istanza)
    {
        
    }
    
    //SPAZIO METODI
    public Prodotto(){
        /*this.codice=numProdotti;
        this.descrizione = "Non disponibile";
        this.costo = 0.0F;
        this.dataProduzione = "2025-01-07";*/
        this(numProdotti, "non disponibile", 0.0F, "2025-01-01");
        
        
    }
    
    
    public Prodotto( String descrizione, float costo, String dataProduzione){
        /*this.codice=numProdotti;
        this.descrizione=descrizione;
        this.costo=costo;
        this.dataProduzione=dataProduzione;*/
        this(numProdotti,descrizione,costo,dataProduzione);
    }
    
    
    
    public Prodotto(int codice, String descrizione, float costo, String dataProduzione){
        this.codice=codice;
        this.descrizione=descrizione;
        this.costo=costo;
        this.dataProduzione=dataProduzione;
        numProdotti++;
    }
    
    
    
    
    /*public void setCodice(int codice){
        
        this.codice = codice;
        
    }*/
    
    public static int getNumProdotti(){
        return numProdotti;
    }
    
    
    public int getCodice(){
        return this.codice;
    }
    
    public void stampaInfo(){
        System.out.println("**** PRODOTTO *****");
        
        System.out.print("Codice:");
        System.out.println(codice);
        
        System.out.print("Descrizione:");
        System.out.println(descrizione);
        
        System.out.print("Costo:");
        System.out.println(costo);
        
        System.out.print("Data di Produzione:");
        System.out.println(dataProduzione);
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getDataProduzione() {
        return dataProduzione;
    }

    public void setDataProduzione(String dataProduzione) {
        this.dataProduzione = dataProduzione;
    }
    
    @Override
    public String toString(){
        return "Prodotto: " + "codice=" + codice + ", descrizione= " + descrizione + ", costo= " + costo + ", dataProduzione= " + dataProduzione + "\n"; 
    }
    
    
}
