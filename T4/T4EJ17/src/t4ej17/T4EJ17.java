/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ17 {
    //preparo el random con code ASCII para el abecedario
    public static char letraRandom() {
        int codigoASCII = (int) Math.floor((Math.random()) * 26 + 97);
        return (char) codigoASCII;
    }
    //Aqui es para hacer que usuario introduzca las letras
    public static char letraIntro() {
        Scanner entrada = new Scanner(System.in);
        char letra = entrada.nextLine().charAt(0);
        return letra;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letraSecreta = letraRandom();
        char intento;
        int intentos = 0;
        //defino las variables y empiezo el bucle
        System.out.println("¡Adivina la letra del abecedario!");

        do {
            intento = letraIntro();
            intentos++;
            // el bucle hasta que intento = la letra random generada
            if (intento < letraSecreta) {
                System.out.println("La letra esta DESPUES en el alfabeto");
            }
            if (intento > letraSecreta) {
                System.out.println("La letra esta ANTES en el alfabeto");
            }

        } while (intento != letraSecreta);
        System.out.println("¡¡ENHORABUENA ACERTASTE!! la letra era: " 
                + letraSecreta);
        System.out.println("El numero de intentos fue: " + intentos);
        // TODO code application logic here
    }

}
