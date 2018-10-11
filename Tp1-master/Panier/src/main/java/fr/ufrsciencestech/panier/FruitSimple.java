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
    private boolean contientPepin;
    
    public FruitSimple(){
        prix=0.0;
        origine="France";
        contientPepin=false;
    }
    
    public FruitSimple(double np, String no, boolean cp) throws FruitSimpleNegException{
     if (prix <= 0.0) {
      throw new FruitSimpleNegException();
     }
     prix=np;
     origine=no;
     contientPepin=cp;
    }
    
    public double getPrix(){
     return this.prix;
    }
    
    public String getOrigine(){
    return this.origine;
    }
    
    public boolean getContientPepin(){
     return this.contientPepin;
    }
    
    public void setPrix(double np){
    prix=np;
    }
    
    public void setOrigine(String no){
    origine=no;
    }
    
    public void setContientPepin(boolean cp){
        this.contientPepin= cp;
    }
    
    public String toString(){
     String res="";
     res+= "Prix = "+this.prix+"\n";
     res+= " Origine : "+this.origine+"\n";
     return res;
    }
    
    }
    

