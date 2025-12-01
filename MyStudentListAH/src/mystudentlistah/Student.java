/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystudentlistah;

/**
 *
 * @author angel
 */
public class Student {
    
    private String name;
    //private StringProperty name;
    private String surname;
    private String code;

    public Student(String name, String surname, String code) {
        this.name = name;
        //this.name = new SimpleStringProperty
        this.surname = surname;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", code=" + code + '}';
    }
    
    
    
}
