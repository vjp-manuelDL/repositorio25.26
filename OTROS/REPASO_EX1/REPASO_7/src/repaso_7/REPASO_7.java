/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*        
"Escribe un programa que juegue con el usuario a adivinar un número.
El ordenador debe generar un número entero aleatorio entre 1 y 100,
y el usuario tiene que intentar adivinarlo.
Cada vez que el usuario introduce un valor, 
el ordenador le dice si el número a adivinar es mayor o menor.
Cuando lo adivina, se muestra un mensaje y el número de intentos." 
         */
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int random = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        boolean acertado = false;

        while (!acertado) {
            System.out.println("Escribe el numero que crees que es:");

            try {
                num = entrada.nextInt();
                intentos++;

                if (num < random) {
                    System.out.println("El numero es mayor");
                } else if (num > random) {
                    System.out.println("El numero es menor");
                }
                else{
                    System.out.println("Enhorabuena has acertado!!!");
                    System.out.println("El numero era: " + random);
                    System.out.println("El numero de intentos fue: " + intentos);
                    acertado = true;
                }
            } catch (Exception e) {
                System.err.println("Error debes escribir un numero");
                intentos++;
                entrada.nextLine();
            }

        }
    }
}
