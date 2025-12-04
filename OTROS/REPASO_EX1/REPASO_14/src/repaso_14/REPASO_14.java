/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_14;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_14 {

    public static char random() {
        return (char) ('a' + (int) (Math.random() * 26));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;
        char secreta = random();
        int intentos = 0;

        do {
            System.out.println("Introduce la letra que crees que es:");
            letra = entrada.nextLine().charAt(0);
            intentos++;

            if (letra < secreta) {
                System.out.println("La letra secreta está DESPUÉS en el abecedario.");
            } else if (letra > secreta) {
                System.out.println("La letra secreta está ANTES en el abecedario.");
            }

        } while (letra != secreta);
        System.out.println("¡Enhorabuena! La letra era: " + secreta);
        System.out.println("Lo adivinaste en " + intentos + " intentos."); // ← Añadido
    }

}

       
