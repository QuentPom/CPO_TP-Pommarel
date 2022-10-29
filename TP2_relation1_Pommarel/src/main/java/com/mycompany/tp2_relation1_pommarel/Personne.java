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
}