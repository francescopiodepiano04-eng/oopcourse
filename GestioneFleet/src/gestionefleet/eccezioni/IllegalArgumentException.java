/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionefleet.eccezioni;

/**
 *
 * @author angel
 */
public class IllegalArgumentException extends RuntimeException{

    /**
     * Creates a new instance of <code>IllegalArgumentException</code> without
     * detail message.
     */
    public IllegalArgumentException() {
    }

    /**
     * Constructs an instance of <code>IllegalArgumentException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalArgumentException(String msg) {
        super(msg);
    }
}
