/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_11;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Admin
 */
public class REPASO_11 {

    //constantes
    private static int numPaci = 1;
    private static int numUrg = 1;


    //sumar
    static int sumarPaci() {
        numPaci++;
        return numPaci;
    }

    static int sumarUrg() {
        numUrg++;
        return numUrg;
    }

    //menu
    static void mostrarMenu() {
        System.out.println("---CLINICA MEDICA---");
        System.out.println("1. Registrar paciente URGENTE");
        System.out.println("2. Registrar paciente NORMAL");
        System.out.println("3. Llamar al siguiente paciente");
        System.out.println("4. Mostrar estadísticas");
        System.out.println("5. Salir");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            mostrarMenu();
            try {
                 opcion = entrada.nextInt();
                if (opcion == 1) {
                    System.out.println("Tu ticket : P" + numPaci);
                    sumarPaci();
                    
                } else if (opcion == 2) {
                    System.out.println("Tu ticket : U" + numUrg);
                    sumarUrg();
                } else if (opcion != 5) {
                    System.err.println("OPCION NO VALIDA");
                }

            } catch (InputMismatchException e) {
                System.err.println("ERROR ,SOLO NUMEROS");
                entrada.nextLine();
            }

        } while (opcion != 5);
        System.out.println("HAS SALIDO DEL PROGRAMA");
    }

}
