



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
import java.util.*;
public class Esercizio10I {

public static void main(String args[]) {
List<String> list = new ArrayList<>(); 

list.add("1");
list.add(null);
list.add('3');

Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) { 

System.out.print(iterator.next());

}}}
