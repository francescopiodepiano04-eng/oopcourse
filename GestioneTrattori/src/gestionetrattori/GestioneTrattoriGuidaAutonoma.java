/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetrattori;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class GestioneTrattoriGuidaAutonoma {
    private Map<Integer, Trattore> flotta;
    
    public GestioneTrattoriGuidaAutonoma(){
        this.flotta = new LinkedHashMap<>();
    }
    
    public void aggiungiTrattore(Trattore t){
        flotta.put(t.getIdTelaio(), t);
    }
    
    public void rimuoviTrattore(int id){
        flotta.remove(id);
    }
    
    public Trattore ricercaTrattore(int id){
        Trattore t=flotta.get(id);
        return t;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int id : flotta.keySet()){
            sb.append(flotta.get(id).toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void esportaInventarioTrattori(String nomeFile){
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(nomeFile)))){
            for(int id : flotta.keySet()){
                Trattore t = flotta.get(id);
                if(t instanceof Irrigatore){
                    Irrigatore i = (Irrigatore) t;
                    pw.println(i.getClass()+";"+i.getIdTelaio()+";"+i.getModello()+";"+i.getPeso()+";"+i.getAnnoImmatricolazione()+";"+i.getNumeroTestine());
                }else if(t instanceof Imballatrice){
                    Imballatrice im = (Imballatrice) t;
                    pw.println(im.getClass()+";"+im.getIdTelaio()+";"+im.getModello()+";"+im.getPeso()+";"+im.getAnnoImmatricolazione()+";"+im.getNumeroRulli());
                }else if(t instanceof Trattore){
                    pw.println(t.getClass()+";"+t.getIdTelaio()+";"+t.getModello()+";"+t.getPeso()+";"+t.getAnnoImmatricolazione()+";"+-1);
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static GestioneTrattoriGuidaAutonoma importaInventarioTrattori(String nomeFile) throws FileNotFoundException{
        GestioneTrattoriGuidaAutonoma gt = new GestioneTrattoriGuidaAutonoma();
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(nomeFile)))){
            s.useLocale(Locale.US);
            s.useDelimiter(";|\\n");
            while(s.hasNext()){
                String type = s.next();
                int id = s.nextInt();
                String modello = s.next();
                double peso = s.nextDouble();
                int anno = s.nextInt();
                if(type.equals(Irrigatore.class.getSimpleName())){
                    int numeroTestine = s.nextInt();
                    Irrigatore ir = new Irrigatore(id, modello, peso, anno, numeroTestine);
                    gt.aggiungiTrattore(ir);
                }else if(type.equals(Imballatrice.class.getSimpleName())){
                    int numeroRulli = s.nextInt();
                    Imballatrice im = new Imballatrice(id, modello, peso, anno, numeroRulli);
                    gt.aggiungiTrattore(im);
                }else if(type.equals(Trattore.class.getSimpleName())){
                    Trattore t = new Trattore(id, modello, peso, anno);
                    gt.aggiungiTrattore(t);
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
            return null;
        }catch(RuntimeException e){};
        return gt;
    }
}
