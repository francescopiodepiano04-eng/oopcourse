/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecontest.classi;
import java.time.LocalDate;
import gestionecontest.interfacce.PersonFilter;

/**
 *
 * @author angel
 */
public class SelectYoungPersonFilter implements PersonFilter{
    private final LocalDate date;
    
    public SelectYoungPersonFilter(int year, int month, int dayOfMonth){
        this.date=LocalDate.of(year, month, dayOfMonth);
    }

    @Override
    public boolean checkPerson(Person p) {
        return p.getBirthDate().isAfter(date);
    }
    
}
