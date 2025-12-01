/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneautorimessa;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author angel
 */
public class Autorimessa extends Box{
    
    private final List<Veicolo> l;

    public Autorimessa(String nome) {
        super(nome);
        this.l= new ArrayList();
    }

    @Override
    public void entra(Veicolo v) {
        l.add(v);
    }

    @Override
    public Veicolo esce(Veicolo v) {
        l.remove(v);
        return v;
    }
    
}
