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
    private java.util.ArrayList<Banane> listOrange;
    private int maxOrange;
                 
    public Panier(){
        this.maxOrange=5;
        this.listOrange = new java.util.ArrayList<Banane>();
    }
    
    public Panier(int max){
        this.maxOrange=max;
        this.listOrange = new java.util.ArrayList<Banane>();
    }
    public int quantite(){
        return listOrange.size();
    }
    public boolean estPlein(){
        return (this.listOrange.size()==this.maxOrange);
    }
    public boolean estVide(){
        return (this.listOrange.size()==0);
    }
    public String toString(){
        String s="";
        for( Object o : this.listOrange)
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
         if(!listOrange.isEmpty())
         {
             Banane o = listOrange.get(listOrange.size()-1);
            ajoute(o);
         }
         else
         {
             ajoute(new Banane());
         }
     }
     
     public void ajoute(Banane o){
         if(listOrange.size()==maxOrange || o == null){
             System.out.println("Trop d'oranges dans le panier.");
         }
         else {
             listOrange.add(o);
             setChanged();
             notifyObservers();
         }
  
     }
     public void retire(){
         if(listOrange.size()>0){
             listOrange.remove(this.quantite()-1);
             setChanged();
             notifyObservers();
         }
         else{
             System.out.println("Le panier est vide !");
         }
         
     }
     
     public double getPrix(){
         double somme=0;
         for(Banane o:listOrange){
             somme+=((Banane)o).getPrix();
         }
         return somme;
     }
     public void boycotteOrigine(String pays){
         int i=0;
         
         while (i<this.quantite())
        {
            if((listOrange.get(i)).getOrigine().equals(pays)){
                 listOrange.remove(i);
             }
            else
            {
                i++;
            }
        }
     }
}
