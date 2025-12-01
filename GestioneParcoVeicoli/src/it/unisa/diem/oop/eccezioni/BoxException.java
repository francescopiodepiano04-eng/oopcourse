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
public class BoxException extends Exception {

    /**
     * Creates a new instance of <code>BoxException</code> without detail
     * message.
     */
    public BoxException() {
    }

    /**
     * Constructs an instance of <code>BoxException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public BoxException(String msg) {
        super(msg);
    }
}
