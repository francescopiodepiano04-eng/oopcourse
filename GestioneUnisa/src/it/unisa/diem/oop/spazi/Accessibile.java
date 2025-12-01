/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.spazi;

import it.unisa.diem.oop.eccezioni.AccessibilePienoException;
import it.unisa.diem.oop.eccezioni.AccessibileVuotoException;
import it.unisa.diem.oop.persone.Persona;

/**
 *
 * @author angel
 */
public interface Accessibile {
    //interfaccia è un'astrazione comportamentale: serie di metodi che determinano il comportamento di una classe
    void entra(Persona p) throws AccessibilePienoException;
    
    Persona esce() throws AccessibileVuotoException;
    
}
