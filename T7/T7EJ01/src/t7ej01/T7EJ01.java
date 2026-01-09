package t7ej01;

import java.util.Scanner;

/**
 *
 * @author agutin
 */
public class T7EJ01 {

    public static void pedirNumero(int[] vector) {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("Escriba 10 numeros enteros a continuacion");
        for (i = 0; i < 10; i++) {
            System.out.println("Introduce el valor para la posicion " + (i+1) + ":");
            vector[i] = entrada.nextInt();
        }
    }

    public static void mostrarPares(int[] vector) {
        int i;
        
        for (i = 0; i < 10; i++) {

            if (vector[i] % 2 == 0) {
                System.out.println("El numero en la posicion " + (i+1) + " es par, el numero es: " + vector[i]);

            }
            else {
                System.out.println("");
            }

        }

    }
    
    public static void main(String[] args) {
        int[] vector= new int[10];
        pedirNumero(vector);
        mostrarPares(vector);
        
        
    }

}
