/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej24;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T4EJ24 {

    public static int pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("Escriba su edad:");
        edad = entrada.nextInt();
        return edad;
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su nombre:");
        return entrada.nextLine();
    }

    public static void mayorEdad(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println("El usuario " + nombre + " es mayor de edad");
        } else {
            System.out.println("El usuario " + nombre + " es menor de edad");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = pedirNombre();
        int edad = pedirEdad();
        mayorEdad(nombre, edad);
        // TODO code application logic here
    }

}
