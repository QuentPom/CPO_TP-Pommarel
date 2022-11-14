/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_pommarel;

/**
 *
 * @author quent
 */
public class Epée extends Arme {
    private int indice;
    public Epée(String nom,int attaque,int ind){
    super(nom,attaque);
    if(ind<100&&ind>0){
        indice=ind;
    
    }
    

    
}

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        if(indice<100&&indice>0){
        this.indice = indice;
        }
    }

    @Override
    public String toString() {
        return "Epée{" + "nom de l'arme=" + nom + ", niveau d'attaque=" + getNiveau_attaque()+ ", indice=" + indice + '}';
    }
    
}
