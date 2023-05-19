/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mavenproject1.tasca4exercici2;

import java.util.Scanner;

/**
 *
 * @author ainag
 */
public class Tasca4exercici2 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       for(int i=1; i<=10;i++) {
           System.out.println("Taula de multiplicar"+ i + ":"  );
           System.out.println("----------------");
           
           for (int j =1; j<=10; j++){
               int resultat= i*j;
               System.out.println(i + "*"+ j + "="+ resultat);
           }
           System.out.println();
       }
              
    }
}
