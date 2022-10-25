/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp2_biere_pommarel;

/**
 *
 * @author quent
 */
public class TP2_Biere_Pommarel {

    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
                7.0, "Dubuisson");//Attribution des ses caractéristique a uneBiere

        uneBiere.lireEtiquette();//Lire l'étiquette(les caractéristiques) de uneBierre
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,
                 "Abbaye de Leffe");
        autreBiere.lireEtiquette();
        BouteilleBiere autre2Biere = new BouteilleBiere("Pelfort", 6.5, "Heineken France");
        autre2Biere.lireEtiquette();
        BouteilleBiere autre3Biere = new BouteilleBiere("Kronembourg", 4.2, "Kronembourg SAS");
        autre3Biere.lireEtiquette();
        BouteilleBiere autre4Biere = new BouteilleBiere("Guiness", 4.2, "Guiness");
        autre4Biere.lireEtiquette();
        uneBiere.decapsuler();// On décapsule uneBiere
        autreBiere.decapsuler();
        autre2Biere.decapsuler();
        autre3Biere.decapsuler();
        
        System.out.println(uneBiere) ; //Affichage de la fonction tostring pour uneBiere
        System.out.println(autreBiere) ;
        System.out.println(autre2Biere) ;
        System.out.println(autre3Biere) ;
        System.out.println(autre4Biere) ;
        
    }
}
