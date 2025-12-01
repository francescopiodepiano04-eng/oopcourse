/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.eccezioni;

/**
 *
 * @author angel
 */
public class AccessibilePienoException extends AccessibileException{

    /**
     * Creates a new instance of <code>AccessibilePienoException</code> without
     * detail message.
     */
    public AccessibilePienoException() {
    }

    /**
     * Constructs an instance of <code>AccessibilePienoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AccessibilePienoException(String msg) {
        super(msg);
    }
}
