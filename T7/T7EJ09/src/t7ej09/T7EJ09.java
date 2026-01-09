package t7ej09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T7EJ09 {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Escriba un numero entero");
        numero = entrada.nextInt();
        return numero;
    }

    public static int[] dividirNumero(int numero) {
        if (numero == 0) {
            return new int[0];
        }

        if (numero < 0) {
            numero = -numero;
        }
        
     // Contar cuántas cifras hay (usando bucle simple)
        int copia = numero;
        int contador = 0;
        while (copia != 0) {
            contador++;
            copia /= 10;
        }

        // Crear array del tamaño exacto
        int[] cifras = new int[contador];

        // Llenar el array: cada cifra va en orden (primera posición = última cifra del número)
        int indice = 0;
        while (numero != 0) {
            cifras[indice] = numero % 10; // obtiene la última cifra
            numero /= 10;                 // elimina la última cifra
            indice++;
        

        }
        return cifras;
    }

    public static void mostrarAlReves(int[] cifras) {
        System.out.print("El numero introducido escrito al revés es el: ");
        for (int i = 0; i < cifras.length; i++) {
            System.out.print(cifras[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numero = pedirNumero();
        int[] cifras = dividirNumero(numero);
        mostrarAlReves(cifras);

    }

}
