package t7ej08;

import java.util.Scanner;

public class T7EJ08 {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Escriba un numero de 5 cifras");
            numero = entrada.nextInt();
            System.err.println("Error debe ser de 5 cifras");
        } while (numero <= 10000 || numero >= 99999);
        return numero;
    }

    public static int [] dividirNumero(int numero) {
        int[] cifras = new int[5];
        int divisor = 10000;
        
        for(int i = 0;i < cifras.length;i++){
            cifras[i]=numero / divisor;
            numero = numero % divisor;
            divisor = divisor / 10;
        }
        return cifras;
        
    }

    public static void mostrarAlReves(int[] cifras) {
        System.out.print("El numero introducido escrito al revés es el: ");
        for (int i = 4; i >= 0; i--) {
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
