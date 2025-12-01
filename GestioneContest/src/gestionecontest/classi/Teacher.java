/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecontest.classi;

/**
 *
 * @author angel
 */
public class Teacher extends Person{
    private final TeacherType type;
    
    
    public Teacher(String name, String surname, TeacherType type, int year, int month, int dayOfMonth) {
        super(name, surname, year, month, dayOfMonth);
        this.type=type;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + "\nType= " + type;
    }
    
}
