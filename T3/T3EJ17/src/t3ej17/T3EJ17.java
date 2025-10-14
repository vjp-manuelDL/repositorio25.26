/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej17;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class T3EJ17{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        double numero;

        // Bucle que se repite mientras el número sea negativo
        do {
            System.out.print("Introduce un número para calcular su raíz cuadrada: ");
            numero = entrada.nextDouble();

            if (numero < 0) {
                System.err.println("El número es incorrecto, no se puede calcular la raíz cuadrada.");}
            
        } while (numero < 0);  // <- Aquí termina el do...while

        // Se calcula la raíz cuadrada fuera del bucle
        double raiz = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
  }
}