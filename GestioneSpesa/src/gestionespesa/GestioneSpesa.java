/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionespesa;
import java.time.LocalDate;

public class GestioneSpesa {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carrello carr = new Carrello();
        
        double totale=0, scontato=0;
        
        carr.addProdotto(new ProdottoAlimentare("3143255", "latte", 2.4, LocalDate.of(2024, 10, 05)));
        carr.addProdotto(new ProdottoAlimentare("31432534", "formaggio", 4.5, LocalDate.of(2024, 11, 2)));
        carr.addProdotto(new ProdottoNonAlimentare("3143423", "fogli", 4.2, "carta"));
        carr.addProdotto(new ProdottoNonAlimentare("31443345", "bottiglia", 3.4, "vetro"));
        carr.addProdotto(new ProdottoAlimentare("31435345", "tonno", 6.1, LocalDate.of(2050, 10, 30)));
        carr.addProdotto(new ProdottoNonAlimentare("31432345", "scatola", 2.6, "polistirolo"));
        carr.addProdotto(new ProdottoNonAlimentare("3143534", "sedia", 20.9, "plastica"));
        carr.addProdotto(new ProdottoAlimentare("3143232", "mozzarella", 4.7, LocalDate.of(2021, 10, 28)));
        carr.addProdotto(new ProdottoNonAlimentare("314235", "marsupio", 10.8, "cotone"));

               
        // Calcolo del prezzo totale
        totale = carr.getTotale();
        System.out.println(totale);
        
        // Calcolo del prezzo scontato
        scontato = carr.getTotaleScontato();
        System.out.println(scontato);

        
        // Stampa dello Scontrino (Contenuto del Carrello)
        System.out.println("\n Scontrino (Contenuto del Carrello)");
        System.out.println(carr.toString());
        
        
    }
        
    
}

