/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.gestioneprodotti;

/**
 *
 * @author angel
 */

import it.unisa.diem.oop.gestioneclienti.Cliente;


public class Fattura {
    //SPAZIO ATTRIBUTI
    private final Prodotto[] prodotti;
    private int riemp;     //dimensione logica
    private int count=0;     //contatore
    private final int idFattura; 
    private final Cliente destinatarioFattura;
    private final String dataEmissione;
    private final double percentualeTassa;
    
    
    public Fattura(int maxProdotti, Cliente destinatario, String dataEmissione, double percTassa){
        prodotti= new Prodotto[maxProdotti];
        riemp=0;
        idFattura=count++;
        destinatarioFattura=destinatario;
        this.dataEmissione=dataEmissione;
        percentualeTassa=percTassa;
    }
    
    /*public Fattura(Cliente destinatario, String dataEmissione, int count, double percTassa){
        prodotti=new Prodotto[50];
        riemp=0;
        idFattura=count++;
        destinatarioFattura=destinatario;
        this.dataEmissione=dataEmissione;
        percentualeTassa=percTassa;
    }*/
    
    public void aggiungiProdotto(Prodotto p){
        if(riemp<prodotti.length){
            prodotti[riemp]=p;
            riemp++;
        }
    }
    
    public double calcolaImponibile(){
        double imponibile=0.0;
        for(int i=0; i<riemp; i++){
            imponibile+=prodotti[i].getCosto();
        }
        return imponibile;
    }
    
    public double calcolaTotale(){
        double imponibile=calcolaImponibile();
        return imponibile+(imponibile*percentualeTassa/100);
    }
    
    public String stampaFattura(){
        StringBuffer s=new StringBuffer();
        s.append("===== FATTURA ID: ").append(idFattura).append(" (").append(dataEmissione).append(") =====\n");
        
        s.append("Cliente: ").append(destinatarioFattura.stampaCliente()).append("\n");
        
        for (int i = 0; i < riemp; i++) {
            s.append(prodotti[i].stampaProdotto()).append("\n");
        }
        
        s.append("--------------------\n");
        s.append("Totale da pagare: €").append(String.format("%.2f", calcolaTotale())).append("\n");
        
        return s.toString();
    }
    
    public int getIdFattura(){
        return this.idFattura;
    }
    

    public String getDataEmissione(){
        return dataEmissione;
    }
    
    public double getPercentualeTassa() {
        return percentualeTassa;
    }
    
    public Cliente getDestinatarioFattura() {
        return destinatarioFattura;
    }
    
    
    public int getRiemp(){
        return riemp;
    }
    
    
}
