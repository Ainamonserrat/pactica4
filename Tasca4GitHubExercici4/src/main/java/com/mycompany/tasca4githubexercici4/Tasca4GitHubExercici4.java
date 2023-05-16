/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tasca4githubexercici4;

import java.util.Scanner;

/**
 *
 * @author Aina
 */
public class Tasca4GitHubExercici4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    System.out.print("Introduïu el número de costats del triangle: ");
    int n = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
          }
        System.out.println();
       }
    }
}