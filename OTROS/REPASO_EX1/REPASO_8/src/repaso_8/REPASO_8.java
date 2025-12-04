/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
 * Ejercicio de repaso 1 – Conversor de medidas con menú (Tema 02 + 03 + 04)
 * 
 * Crea un programa que:
 * 1. Pida al usuario una distancia en metros.
 * 2. Muestre un menú con estas opciones:
 *    - 1. Convertir a kilómetros
 *    - 2. Convertir a centímetros
 *    - 3. Convertir a milímetros
 *    - 4. Salir
 * 3. El programa debe repetirse hasta que el usuario elija la opción 4.
 * 4. Usa métodos estáticos para cada conversión:
 *    - aKilometros(double metros)
 *    - aCentimetros(double metros)
 *    - aMilimetros(double metros)
 * 5. Valida que la opción del menú esté entre 1 y 4.
         */
        
        double metros = Menus.pedirDist();
        int opcion;
        do {
            Menus.mostarMenu();
            System.out.println("Escriba la opcion deseada");
            opcion = entrada.nextInt();
            
            if (opcion == 1) {
                
                System.out.println("Los kilometros son: " + Menus.aKilometros(metros));

            } else if (opcion == 2) {
                System.out.println("Los centimetros son: " + Menus.aCenti(metros));

            } else if (opcion == 3) {
                System.out.println("Los milimetros son: " + Menus.aMili(metros));

            } else {
                System.out.println("ERROR, OPCION NO VALIDA");

            }

        } while (opcion != 4);
        System.out.println("HAS SALIDO DEL PROGRAMA");

    }

}
