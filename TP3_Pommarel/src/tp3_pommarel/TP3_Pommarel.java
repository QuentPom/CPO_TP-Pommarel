/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_pommarel;

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

    }

}
