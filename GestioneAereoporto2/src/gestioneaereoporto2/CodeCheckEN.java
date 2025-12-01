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
public class CodeCheckEN implements CodeChecker{

    @Override
    public boolean check(String codice) {
        if (codice == null || codice.length() != 6) {
            return false;
        }
        
        // Verifica che inizi con "EN"
        if (!codice.startsWith("EN")) {
            return false;
        }
        
        // Verifica i due caratteri numerici (posizioni 2 e 3)
        for (int i = 2; i <= 3; i++) {
            char c = codice.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        // Verifica i due caratteri alfabetici (posizioni 4 e 5)
        for (int i = 4; i <= 5; i++) {
            char c = codice.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        
        return true;
    }
    
}
