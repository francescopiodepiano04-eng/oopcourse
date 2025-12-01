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
public class TargaNonValidaException extends BoxException{

    /**
     * Creates a new instance of <code>TargaNonValidaException</code> without
     * detail message.
     */
    public TargaNonValidaException() {
    }

    /**
     * Constructs an instance of <code>TargaNonValidaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TargaNonValidaException(String msg) {
        super(msg);
    }
}
