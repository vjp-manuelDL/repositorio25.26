/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /*
 * Ejercicio 15 (OBLIGATORIO) – Tema 04
 * 
 * "Diseña un programa en JAVA que pida al usuario dos números por teclado.
 * Posteriormente el programa mostrará un menú que le permitirá al usuario:
 * 
 * 1.- Sumar los números.
 * 2.- Restar los números.
 * 3.- Multiplicar los números.
 * 4.- Dividir los números.
 * 5.- Salir del programa.
 * 
 * Nota 1: Mientras el usuario no pulse 5, el programa no termina y el menú volverá a aparecer.
 * Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones.
 * Nota 3: Utiliza todos los subprogramas (métodos estáticos) que se te ocurran."
 * 
 * ➤ Objetivo: Practicar la modularización con métodos estáticos.
 * ➤ Debes crear al menos los siguientes métodos:
 *    - mostrarMenu()
 *    - sumar(int a, int b)
 *    - restar(int a, int b)
 *    - multiplicar(int a, int b)
 *    - dividir(int a, int b) → con try-catch dentro o en main
 * 
 * ➤ El método main debe quedar limpio: solo coordinar flujo y llamar a métodos.
         */
        System.out.println("Escribe el primer numero:");
        int num1 = entrada.nextInt();

        System.out.println("Escribe el segundo numero:");
        int num2 = entrada.nextInt();

        int opcion;
        do {
            Menus.mostrarMenu();
            opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.println("Resultado de la suma: " + Menus.sumarNum(num1, num2));

            } else if (opcion == 2) {
                System.out.println("Resultado de la resta: " + Menus.restatNum(num1, num2));

            } else if (opcion == 3) {
                System.out.println("Resultado de la multiplicacion: " + Menus.multiNum(num1, num2));

            } else if (opcion == 4) {
                try {
                    System.out.println("Resultado de la division: " + Menus.divNum(num1, num2)); 
                } catch (ArithmeticException e) {
                    System.err.println("NO SE PUEDE DIVIDIR ENTRE CERO");
                }
                

            } else {
                System.err.println("OPCION NO VALIDA");
            }

        } while (opcion != 5);
        System.out.println("HAS SALIDO DEL PROGRAMA");

    }

}
