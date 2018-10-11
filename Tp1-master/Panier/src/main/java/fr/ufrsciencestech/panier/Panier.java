/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;

/**
 *
 * @author vb394093
 */
public class Panier extends Observable{
    private java.util.ArrayList<FruitSimple> listFruitSimple;
    private int maxFruitSimple;
                 
    public Panier(){
        this.maxFruitSimple=5;
        this.listFruitSimple = new java.util.ArrayList<FruitSimple>();
    }
    
    public Panier(int max){
        this.maxFruitSimple=max;
        this.listFruitSimple = new java.util.ArrayList<FruitSimple>();
    }
    public int quantite(){
        return listFruitSimple.size();
    }
    public boolean estPlein(){
        return (this.listFruitSimple.size()==this.maxFruitSimple);
    }
    public boolean estVide(){
        return (this.listFruitSimple.size()==0);
    }
    public String toString(){
        String s="";
        for( Object o : this.listFruitSimple)
        {
            s+=o.toString();
        }
        return s;
    }
     public boolean equals(Panier p)
     {
         return (p.quantite()==this.quantite());
     }
     
     public void ajoute()
     {
         if(!listFruitSimple.isEmpty())
         {
             FruitSimple o = listFruitSimple.get(listFruitSimple.size()-1);
            ajoute(o);
         }
         else
         {
             ajoute(new Orange());
         }
     }
     
     public void ajoute(FruitSimple o){
         if(listFruitSimple.size()==maxFruitSimple || o == null){
             System.out.println("Trop d'oranges dans le panier.");
         }
         else {
             listFruitSimple.add(o);
             setChanged();
             notifyObservers();
         }
  
     }
     public void retire(){
         if(listFruitSimple.size()>0){
             listFruitSimple.remove(this.quantite()-1);
             setChanged();
             notifyObservers();
         }
         else{
             System.out.println("Le panier est vide !");
         }
         
     }
     
     public double getPrix(){
         double somme=0;
         for(FruitSimple o:listFruitSimple){
             somme+=((FruitSimple)o).getPrix();
         }
         return somme;
     }
     public void boycotteOrigine(String pays){
         int i=0;
         
         while (i<this.quantite())
        {
            if((listFruitSimple.get(i)).getOrigine().equals(pays)){
                 listFruitSimple.remove(i);
             }
            else
            {
                i++;
            }
        }
     }
}
