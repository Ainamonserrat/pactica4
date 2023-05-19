/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mavenproject1.tasca4ex3github;

import java.util.Scanner;

/**
 *
 * @author ainag
 */
public class Tasca4ex3github {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      
       int alumnesAprovats =0;
       int alumnesPotAprovar=0;
       int alumnesSuspessos=0;
       
       for (int i=1; i <= 6; i++) {
           System.out.print("Introdueix la nota de l'alumne" + i + ":");
           int nota = sc.nextInt();
           
       if (nota >= 5) {
           alumnesAprovats++;
       } else if (nota >= 4 && nota < 5){
           alumnesPotAprovar++;
       } else{
           alumnesSuspessos++;
       }
           
           
       }
       System.out.println("Alumnes aprovats: "+ alumnesAprovats);
       System.out.println("Alumnes que poden aprovar: "+ alumnesPotAprovar);
       System.out.println("Alumnes que poden suspesos: "+ alumnesSuspessos);
       
       scanner.close();
    }
}
