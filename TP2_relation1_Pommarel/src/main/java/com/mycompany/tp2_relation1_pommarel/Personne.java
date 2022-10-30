/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation1_pommarel;

/**
 *
 * @author quent
 */
public class Personne {
    String pre;
    String Nom;
int nbVoitures ;
Voiture [] liste_voitures ;
    public Personne (String nom, String prenom) {
        pre=prenom;
        Nom=nom;
        liste_voitures = new Voiture[3];
}

@Override
public String toString() {
    return pre +" "+ Nom;
    
       

}
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {     
        
   if (nbVoitures < 3 & voiture_a_ajouter.Proprietaire == null){      //On verifie que il a moin de 3 voitures et que la voiture n'est pas volé
            
     for(int i = 0; i < 3; i ++){      
          if(liste_voitures[i] == null){    //On parcours le tableau de la liste de voitures pour pouvoir ajouter la voiture dans la case vide
             liste_voitures[i] = voiture_a_ajouter;
             nbVoitures ++;
             voiture_a_ajouter.Proprietaire = this;
                    return true;       }
            } 
        }
        return false;
    
    
}

}