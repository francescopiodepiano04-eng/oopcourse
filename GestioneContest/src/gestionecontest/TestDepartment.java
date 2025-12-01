/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecontest;
import gestionecontest.classi.*;
import gestionecontest.interfacce.*;
/**
 *
 * @author angel
 */
public class TestDepartment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department d = new Department();
        
        d.add(new Person("Matteo", "Baldi", 1991, 4, 1));
        d.add(new Person("Luca", "Rossi", 1994, 2, 15));
        d.add(new Student("Marco", "Verdi", "0612708762", 1995, 7, 11));
        d.add(new Student("Luigi", "Bianchi", "0612701732", 1996, 2, 14));
        d.add(new Teacher("Gennaro", "Percannella", TeacherType.ASSOCIATE_PROFESSOR, 1973, 5, 18));
        d.add(new Teacher("Mario", "Vento", TeacherType.FULL_PROFESSOR, 1960, 1, 5));
        System.out.println(d);
        d.sort();
        System.out.println("Ordino gli elementi");
        System.out.println(d);
        
        System.out.println("Ottengo nuovo dipartimento con persone nate dopo l'1/1/1995");
        Department d1 = (Department) d.filter(new SelectYoungPersonFilter(1995,1,1));
        System.out.println(d1);
        
        System.out.println("Ottengo nuovo dipartimento contenente solo gli studenti");
        Department d2 = (Department) d.filter((PersonFilter) new SelectStudentFilter());
        System.out.println(d2);
    }
    
}
