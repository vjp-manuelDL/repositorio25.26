/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej18;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ18 {

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre");
        return entrada.nextLine();
    }

    public static void mostrarNombre(String nombre) {
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = pedirNombre();
        mostrarNombre(nombre);

        // TODO code application logic here
    }

}
