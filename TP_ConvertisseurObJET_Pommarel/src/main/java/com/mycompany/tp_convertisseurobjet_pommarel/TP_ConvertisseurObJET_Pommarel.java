/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp_convertisseurobjet_pommarel;

import java.util.Scanner;

/**
 *
 * @author quent
 */
public class TP_ConvertisseurObJET_Pommarel {

    public static void main(String[] args) {
        double res;
        Convertisseur Monconvertisseur = new Convertisseur();

        
        Scanner sc = new Scanner ( System.in);
        
        System.out.println("Veuillez choisir une conversion 1:(Celcius vers Kelvin) 2:(Kelvin vers Celcius) 3:(Farenheit vers Celcius) 4:(Celcius vers Farenheit) 5:(Kelvin vers Farenheit) 6:(Farenheit vers Kelvin)");

    int a = sc.nextInt();
    if (a==1){
           System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
        res=Monconvertisseur.CelciusVersKelvin(a);
                System.out.println(res);}
                else if (a==2){
                    System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
                        res=Monconvertisseur.KelvinVersCelcius(b);
                                System.out.println(res);}
                else if (a==3){
                       System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
                        res=Monconvertisseur.FarenheitVersCelcius(b);
                                                        System.out.println(res);}
                else if (a==4){
                       System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
                        res=Monconvertisseur.CelciusVersFarenheit(b);
                                                        System.out.println(res);}
                else if (a==5){
                       System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
                        res=Monconvertisseur.CelciusVersFarenheit(b);
                                                        System.out.println(res);}
                else {
                       System.out.println("Veuillez mettre la valeur a convertir");
                    int b = sc.nextInt();
                        res=Monconvertisseur.CelciusVersFarenheit(b);
                                                        System.out.println(res);}








}
    
                        

                        
                        }
    
    
            

