package tp3_pommarel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quent
 */
public class Arme {
    String nom;
    private int niveau_attaque;
    public Arme(String nomArme,int niv_att){
        nom=nomArme;
        niveau_attaque=niv_att;
               
    }

    public int getNiveau_attaque() {
        return niveau_attaque;
    }

    public void setNiveau_attaque(int niveau_attaque) {
        if (niveau_attaque<100 && niveau_attaque>0){
        this.niveau_attaque = niveau_attaque;}
    }
    

    @Override
    public String toString() {
        return "Arme{" + "nom de l'arme=" + nom + ", niveau d'attaque=" + niveau_attaque + '}';
    }
    
}
