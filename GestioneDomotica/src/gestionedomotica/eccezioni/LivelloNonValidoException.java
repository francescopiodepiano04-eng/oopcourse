/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedomotica.eccezioni;

/**
 *
 * @author angel
 */
public class LivelloNonValidoException extends Exception {

    /**
     * Creates a new instance of <code>LivelloNonValidoException</code> without
     * detail message.
     */
    public LivelloNonValidoException() {
    }

    /**
     * Constructs an instance of <code>LivelloNonValidoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LivelloNonValidoException(String msg) {
        super(msg);
    }
}
