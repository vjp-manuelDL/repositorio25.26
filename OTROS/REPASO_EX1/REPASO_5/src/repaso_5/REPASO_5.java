/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
"Diseña un programa en JAVA que pida al usuario dos números por teclado. 
Posteriormente el programa mostrará un menú que le permitirá al usuario:

Sumar los números.
Restar los números.
Multiplicar los números.
Dividir los números.
Salir del programa.
Nota 1: Mientras el usuario no pulse 5, el programa no termina y el menú volverá a aparecer.
Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones." 
         */
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = entrada.nextInt();
        int operacion = 0;
        int opcion;

        do {

            System.out.println("---MENU---");
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                operacion = num1 + num2;
                System.out.println("LA SUMA ES: " + operacion);
            } else if (opcion == 2) {
                operacion = num1 - num2;
                System.out.println("LA RESTA ES: " + operacion);
            } else if (opcion == 3) {
                operacion = num1 * num2;
                System.out.println("EL PRODUCTO ES: " + operacion);
            } else if (opcion == 4) {
                try {
                    operacion = num1 / num2;
                    System.out.println("LA DIVISION ES: " + operacion);
                } catch (ArithmeticException e) {
                    System.err.println("ERROR NO SE PUEDE DIVIDIR ENTRE CERO ");
                }
            }
        } while (opcion != 5);

        System.out.println("HAS SALIDO DEL PROGRAMA");

    }

}
