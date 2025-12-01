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
public class AutorimessaVuotaException extends BoxException {

    /**
     * Creates a new instance of <code>AutorimessaVuotaException</code> without
     * detail message.
     */
    public AutorimessaVuotaException() {
    }

    /**
     * Constructs an instance of <code>AutorimessaVuotaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AutorimessaVuotaException(String msg) {
        super(msg);
    }
}
