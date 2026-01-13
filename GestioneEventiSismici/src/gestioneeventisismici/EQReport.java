/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneeventisismici;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class EQReport {
    private final String name;
    private List<EQEvent> report;
    
    public EQReport(String name){
        this.name=name;
        this.report=new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public void addEvent(EQEvent e){
        this.report.add(e);
    }
    
    public void sort(Comparator<EQEvent> c){
        this.report.sort(c);
    }
    
    public void sort(){
        this.report.sort(null);
    }
    
    @Override
    public String toString(){
        return "EQReport{ name= " + name + "\n"+report;
    }
    
    public static EQReport readFromTextFile(String filename) {
        EQReport eqr = new EQReport("Report from textfile:"+filename);
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line=reader.readLine())!=null){
                EQEvent e = new EQEvent();
                Scanner i = new Scanner(line);
                i.useLocale(Locale.US);
                i.useDelimiter("\\|");
                
                e.setEventID(i.next());
                e.setTime(LocalDateTime.ofInstant(Instant.parse(i.next()), ZoneId.systemDefault()));
                e.setLatitude(i.nextDouble());
                e.setLongitude(i.nextDouble());
                e.setDepthkm(i.nextByte());
                e.setAuthor(i.next());
                e.setCatalog(i.next());
                e.setContributor(i.next());
                e.setContributorID(i.next());
                e.setMagType(i.next());
                e.setMagnitude(i.nextDouble());
                e.setMagAuthor(i.next());
                e.setEventLocationName(i.next());
                
                eqr.addEvent(e);
                
                
            }
        }catch(IOException ex){
            Logger.getLogger(EQReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eqr;
    }
    
    public static EQReport readFromTextFileBis(String filename) {
        EQReport eqr = new EQReport("Report from textfile:"+filename);
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(filename)))){
            EQEvent e;
            s.useDelimiter("\\||\\n");
            s.useLocale(Locale.US);
            if(s.nextLine()==null) return null;
            while(s.hasNext()){
                e = new EQEvent();
                e.setEventID(s.next());
                e.setTime(LocalDateTime.parse(s.next()));
                e.setLatitude(s.nextDouble());
                e.setLongitude(s.nextDouble());
                e.setDepthkm(s.nextDouble());
                e.setAuthor(s.next());
                e.setCatalog(s.next());
                e.setContributor(s.next());
                e.setContributorID(s.next());
                e.setMagType(s.next());
                e.setMagnitude(s.nextDouble());
                e.setMagAuthor(s.next());
                e.setEventLocationName(s.next());
                
                eqr.addEvent(e);
            }
        }catch(IOException ex){
            Logger.getLogger(EQReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eqr;
    }
    
    public static void printToTextFile(EQReport eqr, String filename){
        try(BufferedWriter pw = new BufferedWriter(new FileWriter(filename))){
            
            for(EQEvent e : eqr.report) {
                pw.write(e.getEventID() + '|' + e.getTime()+ '|'+e.getLatitude() + '|'+e.getLongitude()+ '|' + e.getDepthkm()+ '|' +
                                e.getAuthor() + '|'+e.getCatalog()+ '|'+e.getContributor() +'|'+e.getContributorID()+ '|'+
                                e.getMagType()+ '|'+e.getMagnitude()+ '|'+e.getMagAuthor() + '|' +e.getEventLocationName()+ '\n');
            }
            
        } catch (IOException ex) {
            Logger.getLogger(EQReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
