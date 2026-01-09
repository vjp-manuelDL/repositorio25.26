
package t7ej02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T7EJ02 {

    public static void pedirNumero(int[] vector) {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("Escriba 10 numeros enteros a continuacion");
        for (i = 0; i < 7; i++) {
            System.out.println("Introduce el valor para la posicion " + (i+1) + ":");
            vector[i] = entrada.nextInt();
        }
    }

    public static void mostrarNumeros(int[] vector) {
        int i;
        for (i = 0; i < 7; i++) {
            System.out.println("El numero en la posicion:" +(i+1)+ " es: " + vector[i]);
        }
    }
    
    
    public static void intercambiarNumeros(int[] vector){
        int aux;
        aux = vector[1];
        vector[1] = vector[3];
        vector[3]= aux;
    }
        public static void mostrarIntercambiados(int[] vector) {
        int i;
            System.out.println("Ahora intercambiados el 2 y el 4");
        for (i = 0; i < 7; i++) {
            System.out.println("El numero en la posicion:" +i+ " es: " + vector[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] vector= new int[7];
        pedirNumero(vector);
        mostrarNumeros(vector);
        intercambiarNumeros(vector);
        mostrarIntercambiados(vector);
        
        
        
    }

}