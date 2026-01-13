/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetrattori;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author angel
 */
public class Utility {
    
    public static void leggiCSV(String nomeFile) {
    
        try(BufferedReader bf = new BufferedReader(new FileReader(nomeFile))) {
            
            String l;
            
            while((l = bf.readLine()) != null) {
            
                System.out.println(l);
            
            
            }
            

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        catch (IOException ex) {
            System.out.println(ex);
        } 
    
    }
    
}
