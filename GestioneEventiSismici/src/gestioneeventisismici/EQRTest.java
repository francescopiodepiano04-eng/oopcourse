/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneeventisismici;

/**
 *
 * @author angel
 */
public class EQRTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EQReport eq = EQReport.readFromTextFile("query");
        
        System.out.println(eq);
        
        eq.sort(new MagnitudeComparator());
        
        EQReport.printToTextFile(eq, "sorted");
        
    }
    
}
