/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
 * Ejercicio de repaso 3 – Calculadora de estadísticas (Tema 03 + 04)
 * 
 * Crea un programa que:
 * 1. Pida al usuario cuántos números va a introducir (mínimo 2).
 *    - Si introduce un número < 2, vuelve a pedirlo.
 * 2. Luego, le pida esa cantidad de números uno a uno.
 * 3. Al final, muestre:
 *    - La suma total
 *    - La media
 *    - El número mayor
 *    - El número menor
 * 
 * Requisitos de modularización:
 * - pedirCantidad(): devuelve un entero (n ≥ 2)
 * - procesarNumeros(int n): pide los n números y calcula suma, media, max, min
 * - (opcional) mostrarResultados(...)
 * 
 * Controla con try-catch que el usuario no introduzca texto en lugar de números.
         */
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

        do {
            valido = true;
            try {
                num = Cosas.pedirCantidad();
                if (num < 2) {
                    System.out.println("Introduce al menos 2 numeros");
                    valido = false;
                }

            } catch (InputMismatchException e) {
                System.err.println("SOLO SE PERMITEN NUMEROS");
                entrada.nextLine();
                valido = false;
            }

        } while (valido == true);
        
        Cosas.procesarNumeros(num, entrada);
    }
}
