/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej25;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T4EJ25 {

    public static double potencia(double a, double b) {
        if (a == 0 && b < 0) {
            throw new IllegalArgumentException("Error: 0 elevado a un exponente negativo no está definido.");
        }
        return Math.pow(a, b);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base;
        double exponente;
        double resultado;
        System.out.println("Escribe la base (a)");
        base = entrada.nextDouble();

        System.out.println("Escribe el exponente (b)");
        exponente = entrada.nextDouble();

        try {
            resultado = potencia(base, exponente);
            System.out.println("El resultado es: " + resultado);

        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());

        }

        // TODO code application logic here
    }

}
