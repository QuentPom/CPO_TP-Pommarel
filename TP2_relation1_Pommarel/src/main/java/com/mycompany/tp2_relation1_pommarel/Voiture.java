/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation1_pommarel;

/**
 *
 * @author quent
 */
public class Voiture {
    String marq;
    String model;
    int nbVoitures;
Personne Proprietaire ;
    public Voiture (String marque, String modele, int nbvoiture) {
        marq=marque;
        model=modele;
        nbVoitures=nbvoiture;
        Proprietaire = null;


    }
@Override
public String toString() {
    return model+" "+ marq+" "+nbVoitures;
    
    
}
}
