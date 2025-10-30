/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ14 {

    public static int pedirNum() {
        /*Creo la clase que va a pedir el numero hasta el que vamos 
        a comprobar */
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Escribe el numero hasta el que quieres comprobar"
                + "los numeros multiplos de 3");
        numero = entrada.nextInt();
        return numero;
    }

    // Método para corroborar que el numero sea > 0
    public static int mayorOMENOR() {
        int compro = T4EJ14.pedirNum();
        // Obtenemos un número válido del usuario
        while (compro < 0) {
            System.err.println("ERROR el numero debe ser "
                    + "mayor que cero");
            compro = T4EJ14.pedirNum();
        }
        return compro;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato = T4EJ14.mayorOMENOR();
        int principio = 1;
        int contador = 0;
        // Recorremos desde 1 hasta el número introducido
        while (principio < dato) {
            // Si es múltiplo de 3, lo mostramos y contamos
            if (principio % 3 == 0) {
                System.out.print(principio + "/");
                contador++;
            }
            // Incrementamos siempre, para evitar bucles infinitos
            principio++;
        }
        // Mostramos el total de múltiplos encontrados
        System.out.println("El numero total de numeros son: " + contador);

        // TODO code application logic here
    }
}
