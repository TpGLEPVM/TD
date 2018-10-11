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
public class BananeTest {
    
    public BananeTest() {
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
    
    @Test(expected=OrangeNegException.class)
    public void testPrixNegatif() throws FruitSimpleNegException {
        System.out.println("Prix négatif");        
        Banane instance2 = new Banane(-1.0,"France",false);
    }

    /**
     * Test of getPrix method, of class Banane.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Banane instance = new Banane();
        double expResult = 1.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getOrigine method, of class Banane.
     */
    @Test
    public void testGetOrigine() throws FruitSimpleNegException {
        System.out.println("getOrigine");
        String pays = "Espagne";
        
        Banane instance = new Banane();
        Banane instance2 = new Banane(1.0, pays,false);
        
        String expResult = "France";
        String expResult2 = pays;
        
        String result = instance.getOrigine();
        String result2 = instance2.getOrigine();
        
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of setPrix method, of clFruitSimpleNegExceptionass Banane.
     */
    @Test
    public void testSetPrix() throws FruitSimpleNegException {
        System.out.println("setPrix");
        double prix = 1.0;
        Banane instance = new Banane();
        instance.setPrix(prix);
        double result=instance.getPrix();
        
        Banane instance2 = new Banane(2.5,"Espagne",false);
        instance2.setPrix(prix);
        double result2=instance2.getPrix();
        assertTrue(prix==result2);
    }

    /**
     * Test of setOrigine method, of class Banane.
     */
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "";
        Banane instance = new Banane();
        instance.setOrigine(origine);

        assertEquals(origine,instance.getOrigine());
    }

    /**
     * Test of toString method, of class Banane.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Banane instance = new Banane();
        String expResult = "Banane :\nPrix : "+"1.0"+"\nOrigine : "+"France"+"\n\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
