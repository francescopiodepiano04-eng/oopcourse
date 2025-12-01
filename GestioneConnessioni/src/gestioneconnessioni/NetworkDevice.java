/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneconnessioni;

/**
 *
 * @author angel
 */
public abstract class NetworkDevice implements NetworkInterface{
    private NetworkInterface connection;
    private static final int allocati=0;
    private final int adr;
    
    public NetworkDevice(){
        this.adr=allocati;
        this.connection=null;
    }
    
    public int getAddress(){
        return adr;
    }
    
    public NetworkInterface getConnection(){
        return connection;
    }
    
    @Override
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message){
        if(destAddress==this.adr) process(sourceAddress, message);
    }
    
    @Override
    public void connect(NetworkInterface other){
        this.connection=other;
    }
    
    
    @Override
    public boolean equals(Object other){
        if(other==null) return false;
        if(this==other) return true;
        if(this.getClass()!=other.getClass()) return false;
        
        NetworkDevice n = (NetworkDevice) other;
        return this.adr==n.adr;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(adr);
    }
    
    protected abstract void process(int sourceAddress, String message);
    
    @Override
    public String toString(){
        return "Device " + adr;
    }
}
