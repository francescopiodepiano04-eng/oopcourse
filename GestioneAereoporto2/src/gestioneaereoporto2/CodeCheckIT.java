/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneaereoporto2;

/**
 *
 * @author angel
 */
public class CodeCheckIT implements CodeChecker{

    @Override
    public boolean check(String codice) {
        if (codice == null || codice.length() != 7) {
            return false;
        }
        
        // Verifica che inizi con "IT"
        if (!codice.startsWith("IT")) {
            return false;
        }
        
        // Verifica i due caratteri alfabetici (posizioni 2 e 3)
        for (int i = 2; i <= 3; i++) {
            char c = codice.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        
        // Verifica i tre caratteri numerici (posizioni 4, 5 e 6)
        for (int i = 4; i <= 6; i++) {
            char c = codice.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        return true;
    }
    
}
