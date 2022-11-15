/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author quent
 */
public class Baton extends Arme {
    private int age;
    public Baton(String nom ,int attaque, int ag){
    super (nom,attaque);
    if(ag>0&&ag<100){
        age=ag;
        
        
        
    }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0&&age<0){
        this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Baton{" + "nom de l'arme=" + nom + ", niveau d'attaque=" + getNiveau_attaque() + ", age=" + age + '}';
    }
    
           
}
