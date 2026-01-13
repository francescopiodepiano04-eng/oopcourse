/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesensoriluce;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author angel
 */
public class LightSensorReport {
    //Attributi
    private final Set<LightSensorMeasure> report;
    
    
    //Costruttore
    public LightSensorReport(){
        this.report=new TreeSet<>();
    }


    public void addMeasure(LightSensorMeasure lsm) {

        // completare
        report.add(lsm);
        
    }


    // Metodi
    
    public String toString() {

        // completare
        StringBuilder sb = new StringBuilder();
        for(LightSensorMeasure l : report){
            sb.append(l);
        }
        return sb.toString();
        
    }

    public void exportReport(String nomeFile) {
        
        // completare
        try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(nomeFile)))){
            for(LightSensorMeasure lsm : report){
                dos.writeUTF(lsm.getTime().toString());
                dos.writeDouble(lsm.getValue());
                dos.write(lsm.getSensorId());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    public LightSensorReport importReport(String nomeFile) {
        
        // completare
        LightSensorReport r = new LightSensorReport();
        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(nomeFile)))){
            LocalDateTime time = LocalDateTime.parse(dis.readUTF());
            double value = dis.readDouble();
            int id = dis.readInt();
            
            LightSensorMeasure lsm = new LightSensorMeasure(time, value, id);
            r.addMeasure(lsm);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return r;
    }
    
    
    // Non modificare questo metodo per il test
    public void populateReport(int n) {

        Random r = new Random();

        for (int i = 0; i < n; i++) {

            this.addMeasure(new LightSensorMeasure(LocalDateTime.of(2023, r.nextInt(11) + 1, r.nextInt(27) + 1, r.nextInt(23), r.nextInt(59)), r.nextDouble() * 100, r.nextInt(5)));

        }

    }
}
