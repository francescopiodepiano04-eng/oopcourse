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
public class AccessibileVuotoException extends AccessibileException {

    /**
     * Creates a new instance of <code>AccessibileVuotoException</code> without
     * detail message.
     */
    public AccessibileVuotoException() {
    }

    /**
     * Constructs an instance of <code>AccessibileVuotoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AccessibileVuotoException(String msg) {
        super(msg);
    }
}
