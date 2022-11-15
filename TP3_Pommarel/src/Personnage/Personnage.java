/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;
import Arme.Baton;
import Arme.Arme;
import Arme.Epée;
import java.util.ArrayList;
/**
 *
 * @author quent
 */
public class Personnage {
    public String nom;
    private int niveau_vie;
    public Personnage(String nom_perso,int niv_vie){
        nom=nom_perso;
        if (niv_vie>0){
        niveau_vie=niv_vie;
        }
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", niveau_vie=" + niveau_vie + '}';
    }
ArrayList<Arme> tabarme = new ArrayList<Arme>();
   public void limarme(Arme arme){
       if (tabarme.size()<5){
       tabarme.add(arme);
   }
       
   }
      public void armemain(Arme armevoulu){
        for (int i = 0; i < 5; i++) {      
            if (tabarme.get(i)==armevoulu){
                armevoulu=tabarme.get(i);
                
            }
        }
      }
      
}
