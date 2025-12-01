/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempioingsoftware;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angel
 */
public class AdderTest {
    
    

    @Test
    public void testAddPosPos() {
        Adder a = new Adder();
        int res=a.add(3, 4);
        assertEquals(7, res);
    }
    
    @Test
    public void testAddPosNeg() {
        Adder a = new Adder();
        int res=a.add(3, -4);
        assertEquals(-1, res);
    }
    
    @Test
    public void testAddNegNeg() {
        Adder a = new Adder();
        int res=a.add(-3, -4);
        assertEquals(-7, res);
    }
    
}
