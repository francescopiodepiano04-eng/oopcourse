/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneconnessioni;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author angel
 */
public class NetworkHub implements NetworkInterface {
    private final Set<NetworkInterface> connections;
    private final String id;
    
    public NetworkHub(String id){
        this.id=id;
        this.connections=new HashSet<>();
    }

    @Override
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message) {
        System.out.println("Hub " + this.getId() + ": da " + sourceAddress + " via " + sourceInterface + " per " + destAddress + ": " + message);
        
    }

    @Override
    public void connect(NetworkInterface other) {
        connections.add(other);
    }
    
    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        if(this==o) return true;
        if(this.getClass()!=o.getClass()) return false;
        
        NetworkHub h = (NetworkHub) o;
        return this.id.equals(h.id);
    }
    
    public String getId(){
        return id;
    }
    
    @Override
    public int hashCode(){
        int code = id == null ? 0 : id.hashCode();
        return code;
    }
    
    public void printConnections(){
        for(NetworkInterface n : connections){
            n.toString();
        }
    }
    
    @Override
    public String toString(){
        return "Hub " + id;
    }
}
