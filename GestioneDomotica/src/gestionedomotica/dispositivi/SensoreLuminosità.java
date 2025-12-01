/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedomotica.dispositivi;

/**
 *
 * @author angel
 */
public class SensoreLuminosità extends Sensore {
    public SensoreLuminosità(int id){
        super(id);
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Tipo: Sensore di luminosità";
    }
}
