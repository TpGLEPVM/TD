/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import fr.ufrsciencestech.panier.OrangeNegException;
/**
 *
 * @author vb394093
 */
public class Banane extends FruitSimple{
    private double prix;
    private String origine;

    public Banane(){
        super();
    }
    
    public Banane(double np, String no, boolean cp) throws FruitSimpleNegException {
        super(np, no, cp);
        this.prix = prix;
        this.origine = origine;
    }

    @Override
    public String toString(){
        String s="";
        s+="Fruit type : Banane";
        s+=super.toString();
        return s;
    }
    
}
