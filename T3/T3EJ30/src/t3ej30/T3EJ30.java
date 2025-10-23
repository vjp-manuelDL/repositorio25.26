/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej30;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3EJ30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aleatorio = (int) ((Math.random()) * 100 + 1);
        int numero = 0; // Si no la definimos da problemas luego
        int intentos = 0;
        boolean acertado = false;

        while (!acertado) {
            System.out.println("Escribe el numero que crees:");
            try {
                numero = entrada.nextInt();
                intentos++;

                if (numero < aleatorio) {
                    System.out.println("El numero es mayor");
                } else {
                    System.out.println("El numero es menor");
                }

                if (numero == aleatorio) {
                    System.out.println("Enhorabuena acertaste!!!");
                    System.out.println("El numero era: " + aleatorio);
                    System.out.println("El numero de intentos fue: " + intentos);
                }
            } catch (Exception e) {
                //Se produjo un error (introdujo una letra)
                System.err.println("Error debes escribir un numero");
                intentos++;
                entrada.nextLine(); //limpiar el buffer para que no de error
            }
        }


    }
}

// TODO code application logic here

