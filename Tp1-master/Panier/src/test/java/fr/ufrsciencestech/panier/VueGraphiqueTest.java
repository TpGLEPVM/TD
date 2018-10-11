/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import javax.swing.JButton;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mt177991
 */
public class VueGraphiqueTest {
    
    public VueGraphiqueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class VueGraphique.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observable m = null;
        Object o = null;
        VueGraphique instance = new VueGraphiqueImpl();
        instance.update(m, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtn1 method, of class VueGraphique.
     */
    @Test
    public void testGetBtn1() {
        System.out.println("getBtn1");
        VueGraphique instance = new VueGraphiqueImpl();
        JButton expResult = null;
        JButton result = instance.getBtn1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtn2 method, of class VueGraphique.
     */
    @Test
    public void testGetBtn2() {
        System.out.println("getBtn2");
        VueGraphique instance = new VueGraphiqueImpl();
        JButton expResult = null;
        JButton result = instance.getBtn2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VueGraphiqueImpl implements VueGraphique {

        public void update(Observable m, Object o) {
        }

        public JButton getBtn1() {
            return null;
        }

        public JButton getBtn2() {
            return null;
        }
    }
    
}
