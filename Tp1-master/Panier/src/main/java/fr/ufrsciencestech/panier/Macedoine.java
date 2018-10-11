/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author ai265149
 */
public class Macedoine {
    
    private ArrayList<FruitSimple> listeM;
    
    public Macedoine(){
     this.listeM= new ArrayList<FruitSimple>();
    }
    
    public void ajoute(FruitSimple f){
     this.listeM.add(f);
    }
    
    public String toString(){
           String s = "";
        for (int i=0; i< listeM.size(); i++) {
         s+=this.listeM.get(i).toString();
        }
        return s;
    }
    
    public boolean isSedLess(){
     boolean res= true;
      for (int i=0; i< listeM.size(); i++) {
          if (listeM.get(i).getContientPepin()) res= false;
     }
      return res;
    }
    
    
}
