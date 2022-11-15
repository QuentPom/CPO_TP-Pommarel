package Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quent
 */
public class Magicien extends Personnage {  
    boolean c;
    public Magicien(String nom_perso, int niv_vie, boolean confirmé ) {
        super(nom_perso, niv_vie);
        c=confirmé;
        }

    public void setC(boolean c) {
        this.c = c;
    }
    
    }


    



