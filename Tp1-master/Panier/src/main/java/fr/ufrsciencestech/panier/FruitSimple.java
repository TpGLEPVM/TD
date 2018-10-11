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
public abstract class FruitSimple {
    
    private double prix;
    private String origine;
    
    public FruitSimple(){
        prix=0.0;
        origine="France";
    }
    
    public FruitSimple(double np, String no){
     prix=np;
     origine=no;
    }
    
    public double getPrix(){
     return this.prix;
    }
    
    public String getOrigine(){
    return this.origine;
    }
    
    public void setPrix(double np){
    prix=np;
    }
    
    public void setOrigine(String no){
    origine=no;
    }
    
    public String toString(){
     String res="";
     res+= "Prix = "+this.prix+"\n";
     res+= " Origine : "+this.origine+"\n";
     return res;
    }
    
    }
    

