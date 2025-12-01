/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneesami;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author angel
 */
public class LibrettoEsami implements Serializable{
    private Map<String, List<EsameSuperato>> m;
    
    public LibrettoEsami(){
        this.m=new HashMap<>();
    }
    
    
}
