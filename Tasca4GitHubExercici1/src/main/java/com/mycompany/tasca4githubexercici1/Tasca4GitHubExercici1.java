/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tasca4githubexercici1;

import java.util.Scanner;

/**
 *
 * @author Aina
 */
public class Tasca4GitHubExercici1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    System.out.print("Introdueix un número entre 1 i 10: ");
    int numero = sc.nextInt();
    
    if (numero < 1 || numero > 10) {
        System.out.println("Error! El número ha d'estar entre 1 i 10");
        return;
    }
   
    System.out.println("Taula de multiplicar del " + numero + ":");
    for (int i = 1; i <= 10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }
    
}
