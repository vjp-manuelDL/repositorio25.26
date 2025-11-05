/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej15;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T4EJ15 {

    public static int pedirNUM1() {
        Scanner entrada = new Scanner(System.in);
        int num1;
        System.out.println("Escribe el primer numero");
        num1 = entrada.nextInt();
        return num1;
    }

    public static int pedirNUM2() {
        Scanner entrada = new Scanner(System.in);
        int num2;
        System.out.println("Escribe el segundo numero");
        num2 = entrada.nextInt();
        return num2;
    }

    public static int menuELECCION() {
        Scanner entrada = new Scanner(System.in);
        int eleccion;
        System.out.println("--- MENU---");
        System.out.println("1.- Sumar los números.");
        System.out.println("2.- Restar los números.");
        System.out.println("3.- Multiplicar los números.");
        System.out.println("4.- Dividir los números.");
        System.out.println("5.- Salir del programa.");
        System.out.print("Elige una opción (1-5): ");
        eleccion = entrada.nextInt();
        return eleccion;

    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = pedirNUM1();
        int num2 = pedirNUM2();

        int opcion;
        do {
            opcion = menuELECCION();

            if (opcion == 1){
                System.out.println("LA SUMA ES: " + sumar(num1, num2));
            } else if (opcion == 2) {
                System.out.println("LA RESTA ES: " + restar(num1, num2));
            } else if (opcion == 3) {
                System.out.println("EL PRODUCTO ES: " + multiplicar(num1, num2));
            } else if (opcion == 4) {
                try {
                    int resultado = dividir(num1, num2);
                    System.out.println("LA DIVISION ES: " + resultado);
                } catch (ArithmeticException exception) {
                    System.err.println("ERROR, no se puede dividir entre 0");
                }
            } else if (opcion == 5) {
                System.out.println("SALIENDO DEL PROGRAMA");
            } else {
                System.err.println("OPCION NO VALIDA, SOLO VALIDO ENTRE 1 Y 57");
            }
        } while (opcion != 5);
    } // TODO code application logic here
}
