/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecontest.classi;
import java.time.LocalDate;
/**
 *
 * @author angel
 */
public class Person implements Comparable<Person> {
    private final String name;
    private final String surname;
    private final LocalDate birthDate;
    
    public Person(String name, String surname, int year, int month, int dayOfMonth){
        this.name=name;
        this.surname=surname;
        this.birthDate=LocalDate.of(year, month, dayOfMonth);
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public LocalDate getBirthDate(){
        return LocalDate.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth());
    }
    
    @Override
    public String toString(){
        return "Name = " + name + "\nSurname = " + surname + "\nBirthDate = " + getBirthDate();
    }

    @Override
    public final int compareTo(Person o) {
        return this.getBirthDate().compareTo(o.getBirthDate());
    }
    
    
    
}
