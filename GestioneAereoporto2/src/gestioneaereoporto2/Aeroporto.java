/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneaereoporto2;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */

public class Aeroporto {
    private Map<String, Aeromobile> aeroporto;
    private final CodeChecker check;
    
    
    public Aeroporto(CodeChecker check){
        this.check=check;
        this.aeroporto=new HashMap<>();  
    }
    
    public boolean inserisci(Aeromobile a){
        if(check==null){
            aeroporto.put(a.getCodice(), a);
            return true;
        }
        if(check.check(a.getCodice())){
            aeroporto.put(a.getCodice(), a);
            return true;
        }
        return false;
    }
    
    public Aeromobile cerca(String codice){
        return aeroporto.get(codice);
    }
    
    public Aeromobile rimuovi(String codice){
        return aeroporto.remove(codice);
    }
    
    public int elementi(){
        return aeroporto.size();
    }
    
    
    public void salvaDOS(String nomeFile) throws IOException{
        FileOutputStream fos = new FileOutputStream(nomeFile);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);
        for(Aeromobile a : aeroporto.values()){
            dos.writeUTF(a.getCodice());
            dos.writeInt(a.getNumSequenziale());
            dos.writeUTF(a.getClass().getSimpleName());
            if(a instanceof AereoAMotore){
                AereoAMotore am = (AereoAMotore) a;
                dos.writeInt(am.getNumRotori());
            }
            if(a instanceof Aliante){
                Aliante al = (Aliante) a;
                dos.writeDouble(al.getEfficienza());
            }
        }
        dos.close();
    }
    
    public static Aeroporto leggiDIS(String nomeFile) throws IOException{
        FileInputStream fis = new FileInputStream(nomeFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);
        
        Aeroporto ap = new Aeroporto(null);
        
        try{
            while(true){
                String codice = dis.readUTF();
                int numSequenziale = dis.readInt();
                String tipo = dis.readUTF();
                if(tipo.equals("Aliante")){
                    double eff=dis.readDouble();
                    Aliante al = new Aliante(codice, eff);
                    
                }
                int numRot = dis.readInt();
                AereoAMotore am = new AereoAMotore(codice, numRot);
                
                
            }
        }catch(EOFException e){
            System.out.println("Lettura completata");
        }
        dis.close();
        return ap;
    }
    
    
    public void salvaOBJ(String nomeFile){
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nomeFile)))){
            oos.writeObject(this);
        } catch (IOException ex) {
            Logger.getLogger(Aeroporto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Aeroporto leggiOBJ(String nomeFile){
        Aeroporto a = null;
        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(nomeFile)))){
            a = (Aeroporto)ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Aeroporto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public void salvaCSV(String nomeFile){
        try( PrintWriter pw = new PrintWriter(new FileWriter(nomeFile)) ){
            
            pw.println("CODICE;NUMERO SEQUENZA");
            for(Aeromobile a : this.aeroporto.values()){
                pw.append(a.getCodice());
                pw.append(';');
                pw.print(a.getNumSequenziale());
                if(a instanceof Aliante){
                    pw.println("EFFICIENZA");
                    Aliante al = (Aliante) a;
                    pw.print(al.getEfficienza());
                }
                pw.append("NUM ROTORI");
                AereoAMotore am = (AereoAMotore) a;
                pw.print(am.getNumRotori());
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Aeroporto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        for(Aeromobile a : aeroporto.values()){
            sb.append(a);
            
        }
        return sb.toString();
    }
    
    
}
