/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

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
public class MacedoineTest {
    
    public MacedoineTest() {
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
     * Test of ajoute method, of class Macedoine.
     */
    @Test
    public void testAjoute() {
        System.out.println("ajoute");
        FruitSimple f = null;
        Macedoine instance = new Macedoine();
        instance.ajoute(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Macedoine.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Macedoine instance = new Macedoine();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSedLess method, of class Macedoine.
     */
    @Test
    public void testIsSedLess() {
        System.out.println("isSedLess");
        Macedoine instance = new Macedoine();
        boolean expResult = false;
        boolean result = instance.isSedLess();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
