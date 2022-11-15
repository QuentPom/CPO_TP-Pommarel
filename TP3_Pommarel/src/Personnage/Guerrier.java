/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author quent
 */
public class Guerrier extends Personnage {
    boolean ch;
    public Guerrier(String nom_perso, int niv_vie, boolean cheval) {
        super(nom_perso, niv_vie);
        ch=cheval;
    }

    public void setCh(boolean ch) {
        this.ch = ch;
    }
    
}
