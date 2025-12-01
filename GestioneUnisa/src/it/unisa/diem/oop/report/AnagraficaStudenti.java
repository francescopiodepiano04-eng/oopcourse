/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.report;

import it.unisa.diem.oop.persone.Studente;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class AnagraficaStudenti implements Serializable{
    
    private String descrizione;
    
    private Map<String, Studente> studenti;
    
    public AnagraficaStudenti(String descrizione){
        this.descrizione=descrizione;
        this.studenti=new HashMap<>();
    }
    
    public void aggiungi(Studente s){
        this.studenti.put(s.getMatricola(), s);
    }
    
    public Studente cerca(String matricola){
        return this.studenti.get(matricola);
        //se l'oggetto non è presente restituisce null
    }
    
    public void salvaDOS(String nomeFile) throws IOException{
        FileOutputStream fos = new FileOutputStream(nomeFile);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeUTF(descrizione);
        for(Studente s : studenti.values()){
            dos.writeUTF(s.getNome());
            dos.writeUTF(s.getCognome());
            dos.writeUTF(s.getCodiceFiscale());
            dos.writeUTF(s.getMatricola());
            dos.writeUTF(s.getRuolo());
            dos.writeFloat(s.getVotoMedio());
        }
        
        dos.close();
         
    }
    
    public static AnagraficaStudenti leggiDIS(String nomeFile) throws IOException{
        FileInputStream fis = new FileInputStream(nomeFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);
        
        AnagraficaStudenti a = new AnagraficaStudenti(dis.readUTF());
        
        try{
            while(true){
                String nome = dis.readUTF();
                String cognome = dis.readUTF();
                String codFiscale = dis.readUTF();
                String matricola = dis.readUTF();
                String ruolo = dis.readUTF();
                float votoMedio = dis.readFloat();
                
                Studente s = new Studente(nome, cognome, codFiscale, matricola, votoMedio);
                a.aggiungi(s);
            }
        }catch(EOFException e){
            System.out.println("Lettura completa");
        }
        
        dis.close();   ///la chiusura va fatta in blocco finally
        
        return a;
    }
    
    public void salvaOBJ(String nomeFile){
        //try-with-resources
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nomeFile)))){
            oos.writeObject(this);
            
        } catch (IOException ex) {
            Logger.getLogger(AnagraficaStudenti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static AnagraficaStudenti leggiOBJ(String nomeFile){
        AnagraficaStudenti a = null;
        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(nomeFile)))){
            a = (AnagraficaStudenti)ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(AnagraficaStudenti.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex){
            Logger.getLogger(AnagraficaStudenti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    } 
    
    public void salvaCSV(String nomeFile){
        
        try( PrintWriter pw = new PrintWriter(new FileWriter(nomeFile)) ){
            
            pw.println("NOME;COGNOME;CODICEFISCALE;MATRICOLA;VOTOMEDIO");
            for(Studente s : this.studenti.values()){
                pw.append(s.getNome());
                pw.append(';');
                pw.append(s.getCognome());
                pw.append(';');
                pw.append(s.getCodiceFiscale());
                pw.append(';');
                pw.append(s.getMatricola());
                pw.append(';');
                pw.println(s.getVotoMedio());
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(AnagraficaStudenti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static AnagraficaStudenti leggiCSV(String nomeFile) {
        String descrizione = nomeFile.split("\\.")[0];   //recuperiamo la descrizione dal nome del file
        AnagraficaStudenti a = new AnagraficaStudenti(descrizione);
        try(BufferedReader br = new BufferedReader(new FileReader(nomeFile))){
            String linea;
            if(br.readLine()==null) return null;
            while((linea=br.readLine())!=null){
                String campi[] = linea.split(";");
                a.aggiungi(new Studente(campi[0], campi[1], campi[2], campi[3], Float.parseFloat(campi[4])));
            }
        } catch (IOException ex) {
            Logger.getLogger(AnagraficaStudenti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public static AnagraficaStudenti leggiCSVScan(String nomeFile){
        String descrizione = nomeFile.split("\\.")[0];
        AnagraficaStudenti a = new AnagraficaStudenti(descrizione);
        
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(nomeFile)))){
            s.useDelimiter("[;\n]");
            s.useLocale(Locale.US);
            if(s.nextLine()==null) return null;
            while(s.hasNext()){
                String nome = s.next();
                String cognome = s.next();
                String codiceFiscale = s.next();
                String matricola = s.next();
                float votoMedio = s.nextFloat();
                a.aggiungi(new Studente(nome, cognome, codiceFiscale, matricola, votoMedio));
            }
        } catch (IOException ex) {
            Logger.getLogger(AnagraficaStudenti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Anagrafica: " + descrizione + "\n");
        //si scorre la lista dei valori
        for(Studente s : this.studenti.values()){
            sb.append(s);
        }
        return sb.toString();
    }
    
}
