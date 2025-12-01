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
public abstract class Dispositivo {
    private final int id;
    private boolean acceso;
    
    public Dispositivo(int id){
        this.id=id;
        this.acceso=true;
    }
    
    public void accendi(){
        this.acceso=true;
    }
    
    public void spegni(){
        this.acceso=false;
    }
    
    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }
    
    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        if(this==o) return true;
        if(this.getClass()!=o.getClass()) return false;
        
        Dispositivo d = (Dispositivo) o;
        return this.getId() == d.getId();
    }
    
    public int getId(){
        return id;
    }
    
    public boolean isAcceso(){
        return acceso;
    }
    
    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();
        str.append("ID dispositivo: ").append(id).append(", Stato: ");
        if(acceso){
            str.append("Acceso  ");
        }else{
            str.append("Spento  ");
        }
        return str.toString();
    }
    
}
