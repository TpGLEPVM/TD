/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author ai265149
 */
public class FruitSimpleNegException extends Exception {
    
    public FruitSimpleNegException(){
     super("Fruit ayant un prix négatif");
    }
}
