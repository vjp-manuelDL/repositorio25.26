/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej07;

import java.util.Scanner;
import t4ej07.Entropy;

/**
 *
 * @author alumno
 */
public class T4EJ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        System.out.println("Escribe el primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Escribe el segundo  numero:");
        num2 = entrada.nextInt();
        System.out.println("Escribe el tercer numero:");
        num3 = entrada.nextInt();
        System.out.println("Escribe el cuarto numero:");
        num4 = entrada.nextInt();
        
        Entropy.eljass(num1, num2, num3, num4);
        
        // TODO code application logic here
    }

}
