/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp_convertisseurobjet_pommarel;

/**
 *
 * @author quent
 */
public class TP_ConvertisseurObJET_Pommarel {

    public static void main(String[] args) {
        double res;
        double res1;
        Convertisseur Monconvertisseur = new Convertisseur();
        res = Monconvertisseur.CelciusVersKelvin(18.0);
        res1 = Monconvertisseur.FarenheitVersCelcius(20);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(Monconvertisseur) ;

    }
}
