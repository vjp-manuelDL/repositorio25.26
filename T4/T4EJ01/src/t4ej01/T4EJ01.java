/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Introduzca un número:");
        numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("El numero introdcido es POSITIVO");

        } else {
            System.out.println("El numero introducido es NEGATIVO");
        }
    }
    // TODO code application logic here
}


