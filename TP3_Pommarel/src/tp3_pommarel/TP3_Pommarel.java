/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_pommarel;

import Personnage.Personnage;
import Personnage.Guerrier;
import Personnage.Magicien;
import Arme.Baton;
import Arme.Arme;
import Arme.Epée;
import java.util.ArrayList;

/**
 *
 * @author quent
 */
public class TP3_Pommarel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arme arme1 = new Arme("excalibur", 1);
        System.out.println(arme1.getNiveau_attaque());
        
        
    Baton baton1 =new Baton("Excalibur",7,5);
    System.out.println(baton1);
        Baton baton2 =new Baton("Durandal",4,7);
    System.out.println(baton2);
    Epée epée1=new Epée("Chêne",4,5);
    System.out.println(epée1);
Epée epée2=new Epée("Chêne",5,6);
    System.out.println(epée2);
    ArrayList<Arme> tab = new ArrayList<Arme>();
    tab.add(baton1);
    tab.add(baton2);
    tab.add(epée1);
    tab.add(epée2);
System.out.println(tab);
Magicien gandalf = new Magicien("Gandalf",65,true);
Magicien garcimore = new Magicien("garcimore",44,false);
Guerrier Conan = new Guerrier("conan",78,false);
Guerrier lanister = new Guerrier("lanister",45,true);
    ArrayList<Personnage> tab1  = new ArrayList<Personnage>();
    tab1.add(gandalf);
    tab1.add(garcimore);
    tab1.add(Conan);
    tab1.add(lanister);
System.out.println(tab1);

    }
}

