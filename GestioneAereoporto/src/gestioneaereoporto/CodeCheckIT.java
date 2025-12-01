/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneaereoporto;

import gestioneaereoporto.interfacce.CodeChecker;

/**
 *
 * @author angel
 */
public class CodeCheckIT implements CodeChecker {

    @Override
    public boolean check(String codice) {
        if (codice == null || codice.length() != 7) {
            return false;
        }
        if (!codice.substring(0, 2).equals("IT")) {
            return false;
        }
        for (int i = 2; i < 4; i++) {
            char c = codice.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        for (int i = 4; i < 7; i++) {
            char c = codice.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
}
