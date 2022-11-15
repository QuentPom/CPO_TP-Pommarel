/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author quent
 */
public class Personnage {
    public String nom;
    private int niveau_vie;
    public Personnage(String nom_perso,int niv_vie){
        nom=nom_perso;
        if (niv_vie<100&&niv_vie>100){
        niveau_vie=niv_vie;
        }
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", niveau_vie=" + niveau_vie + '}';
    }

   
      
}
