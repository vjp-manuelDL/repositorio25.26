/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_programacion;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class EXAMEN_PROGRAMACION {

    static void mostrarMenu() {
        System.out.println("---MENU---");
        System.out.println("-Introduzca la opcion deseada-");
        System.out.println("1-Analizar señal recibida");
        System.out.println("2-Ajustar potencias motores");
        System.out.println("3-Calcular volumen planeta");
        System.out.println("4-Salir del programa");
    }
//Creo la clase para analizar la señal

    static int analizarSeñal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero entero de la señal");
        int numeroseñal = entrada.nextInt();
        return numeroseñal;
    }

    /*creo 3 clases para llevarme esos 3 valores y ordenarlos luego
    static int potencia1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Porfavor introduzca el primer numero: ");
        int num1 = entrada.nextInt();
        return num1;
    }

    static int potencia2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Porfavor introduzca el segundo numero: ");
        int num2 = entrada.nextInt();
        return num2;
    }

    static int potencia3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Porfavor introduzca el tercer numero: ");
        int num3 = entrada.nextInt();
        return num3;
    }
    
    
    las tenia creadas pero como me daba error , pido y ordeno os numeros 
    en el propio ordenar numeros
    
     */
    static void ordenarPotencias() {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int temp;

        System.out.println("Porfavor introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Porfavor introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Porfavor introduzca el tercer numero: ");
        num3 = entrada.nextInt();

        if (num1 > num2 || num1 > num3) {
            temp = num1;
            num1 = num2;
            num2 = num3;
            num3 = temp;

        } else if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;

        } else if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("El orden es: " + num1 + " " + num2 + " " + num3);
    }

    static void calcularVolumen() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el radio del planeta");
        double radio = entrada.nextDouble();

        double volumen = (4 / 3) * Math.PI * (radio * radio * radio);
        
        System.out.println("El volumen del planeta es: " + volumen);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {

            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                if (opcion == 1) {
                    boolean acertado = false;
                    int div = 2;
                    int numero = 0;
                    int señal = analizarSeñal();

                    do {
                        if (señal % div == 0) {
                            acertado = true;
                            numero = div;
                        } else {
                            div++;
                        }
                    } while (!acertado);
                    System.out.println("El divisor es: " + numero);
                }

            } catch (InputMismatchException e) {
                System.err.println("SOLO SE ACEPTAN NUMEROS");
                entrada.nextLine();
            }
            if (opcion == 2) {
                ordenarPotencias();
            }

            if (opcion == 3) {
                calcularVolumen();
            }
        } while (opcion != 4);
        System.err.println("HAS SALIDO DEL PROGRAMA");

    }

}
