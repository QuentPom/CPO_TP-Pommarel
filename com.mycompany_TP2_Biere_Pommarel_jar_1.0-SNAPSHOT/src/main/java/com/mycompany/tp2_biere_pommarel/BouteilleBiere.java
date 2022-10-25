package com.mycompany.tp2_biere_pommarel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author quent
 */
public class BouteilleBiere {

    String nom; //attribution des types aux variables pour les caractéristique de la biere
    double degreAlcool;
    String Brasserie;
    boolean Ouvert;

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        Brasserie = uneBrasserie;
        Ouvert = false;
    } //Définition des variables pour la fonction lire etiquette

    public void decapsuler() {
        if (Ouvert == false) {
            Ouvert = true;
        } else {
            System.out.println("La bouteille est déja ouverte");
        }

    } //On décapsule la biere grace a booleen qui vaut true lorsqu'elle est ouverte et false lorsqu'elle est fermé

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool
                + " degres) \nBrasserie : " + Brasserie );
    } //Lecture de l'étiquette en fonction de l'attribution des variables qui ont était effectué
    @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) ouverte ?";
if (Ouvert == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
} // Retour d'une chaine qui exprime le nom de la biere le degres d'alcool et si elle est ouverte ou pas

}
