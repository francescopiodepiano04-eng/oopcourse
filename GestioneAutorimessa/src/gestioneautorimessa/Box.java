/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneautorimessa;

/**
 *
 * @author angel
 */
public abstract class Box {
    
    private String nome;
    
    public Box( String nome){
        
        this.nome=nome;
    }
    
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public abstract void entra(Veicolo v);
    public abstract Veicolo esce(Veicolo v);
    
    @Override
    public String toString(){
        return "Nome Box = " + nome + "\n";
    }
}
