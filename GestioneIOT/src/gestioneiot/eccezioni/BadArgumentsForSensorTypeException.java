/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneiot.eccezioni;

/**
 *
 * @author angel
 */
public class BadArgumentsForSensorTypeException extends RuntimeException {

    /**
     * Creates a new instance of <code>BadArgumentsForSensorTypeException</code>
     * without detail message.
     */
    public BadArgumentsForSensorTypeException() {
    }

    /**
     * Constructs an instance of <code>BadArgumentsForSensorTypeException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public BadArgumentsForSensorTypeException(String msg) {
        super(msg);
    }
}
