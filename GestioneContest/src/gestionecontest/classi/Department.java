/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecontest.classi;

import gestionecontest.interfacce.Filterable;
import gestionecontest.interfacce.PersonFilter;
import gestionecontest.interfacce.Sortable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author angel
 */
public class Department extends LinkedList<Person> implements Filterable, Sortable{
    
    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();
        for(Person p : this){
            str.append(p.toString());
            str.append("\n*****\n");
        }
        return str.toString();
    }

    @Override
    public List<Person> filter(PersonFilter f) {
        List<Person> filtered = new LinkedList<>();
        for(Person p : this){
            if(f.checkPerson(p)){
                filtered.add(p);
            }
        }
        return filtered;
    }

    @Override
    public void sort() {
        Collections.sort(this);
    }
}
