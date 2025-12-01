/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneeventisismici;

import java.util.Comparator;

/**
 *
 * @author angel
 */
public class MagnitudeComparator implements Comparator<EQEvent>{

    @Override
    public int compare(EQEvent o1, EQEvent o2) {
        if(o1.getMagnitude()>o2.getMagnitude()) return 1;
        if(o1.getMagnitude()==o2.getMagnitude()) return 0;
        return -1;
    }
    
}
