/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t_manip_pommarel;

/**
 *
 * @author quent
 */
public class T_manip_Pommarel {

    public static void main(String[] args) {
Tartiflette assiette1 = new Tartiflette(500) ;
Tartiflette assiette2 = new Tartiflette(700) ;  
    Tartiflette assiette3 = assiette2 ; 
    System.out.println("nb de calories de Assiette 2 : " +
assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " +
assiette3.nbCalories) ;
}
}
