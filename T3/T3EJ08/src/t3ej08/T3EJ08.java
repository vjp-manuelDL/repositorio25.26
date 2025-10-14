/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej08;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3EJ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int dinero;
        System.out.println("Escribe el dinero que quieres cambiar: ");
        dinero = entrada.nextInt();
        
        int b50 = dinero /50;
        int b20 = dinero % 50 / 20;
        int b10 = dinero % 50 %20 /10;
        int b5  = dinero % 50 %20 % 10 /5;
        int m2 = dinero % 50 %20 % 10 % 5 /2;
        int m1 = dinero % 50 %20 % 10 % 5 % 2 % 1;
        
        if (b50>0){System.out.println("Serian " + b50 + " billetes de 50");}
        if (b20>0){System.out.println("Serian " + b20 + " billetes de 20");}
        if (b10>0){System.out.println("Serian " + b10 + " billetes de 10");}
        if (b5>0){System.out.println("Serian " + b5 + " billetes de 5");}
        if (m2>0){System.out.println("Serian " + m2 + " monedas de 2");}
        if (m1>0){System.out.println("Serian " + m1 + " monedas de 1");}
        
        // TODO code application logic here
    }
    
}
