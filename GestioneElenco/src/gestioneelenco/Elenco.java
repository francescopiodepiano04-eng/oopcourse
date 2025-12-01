/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneelenco;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author angel
 */
public class Elenco {
    private final Set<Persona> elenco;
    
    public Elenco(){
        this.elenco=new TreeSet<>();
    }
    
    

   
    public void aggiungi(Persona p) {
    
    
      elenco.add(p);
    
    }   


    @Override
    public String toString() {
        
      StringBuilder str = new StringBuilder();
      str.append("L'elenco è formato da: \n");
      for(Persona p : elenco){
          str.append(p.toString());
          str.append("\n***\n");
          
      }
      return str.toString();
    }
}
