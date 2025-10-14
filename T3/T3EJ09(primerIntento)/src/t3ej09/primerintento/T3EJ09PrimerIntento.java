/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej09.primerintento;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class T3EJ09PrimerIntento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, num4; //Variable de los 4 numeros
        int pos1 = 0, pos2 = 0, pos3 = 0, pos4 = 0; //Variable para ordenarlos
        
          System.out.println("Escribe el primer numero:");
        num1 = entrada.nextInt();

        System.out.println("Escribe el segundo numero:");
        num2 = entrada.nextInt();

        System.out.println("Escribe el tercer numero:");
        num3 = entrada.nextInt();

        System.out.println("Escribe el cuarto numero:");
        num4 = entrada.nextInt();

        /* Ahora la cosa es usar el if y else para ir 
        comparando los 4 numeros 1 a 1 para ver cual es menor y cual
        es mayor, Es ir mirando las posibilades hasta encontrar la
        que da con el orden ascendente de los numeros que escribimos
        */
        if (num1 <= num2 && num1 <= num3 && num1 <= num4) {
            pos1 = num1;
            if (num2 <= num3 && num2 <= num4) {
                pos2 = num2;
                if (num3 <= num4) {
                    pos3 = num3; pos4 = num4;
                } else {
                    pos3 = num4; pos4 = num3;
                }
            } else if (num3 <= num2 && num3 <= num4) {
                pos2 = num3;
                if (num2 <= num4) {
                    pos3 = num2; pos4 = num4;
                } else {
                    pos3 = num4; pos4 = num2;
                }
            } else {
                pos2 = num4;
                if (num2 <= num3) {
                    pos3 = num2; pos4 = num3;
                } else {
                    pos3 = num3; pos4 = num2;
                }
            }
        } else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            pos1 = num2;
            if (num1 <= num3 && num1 <= num4) {
                pos2 = num1;
                if (num3 <= num4) {
                    pos3 = num3; pos4 = num4;
                } else {
                    pos3 = num4; pos4 = num3;
                }
            } else if (num3 <= num1 && num3 <= num4) {
                pos2 = num3;
                if (num1 <= num4) {
                    pos3 = num1; pos4 = num4;
                } else {
                    pos3 = num4; pos4 = num1;
                }
            } else {
                pos2 = num4;
                if (num1 <= num3) {
                    pos3 = num1; pos4 = num3;
                } else {
                    pos3 = num3; pos4 = num1;
                }
            }

        } else if (num3 <= num1 && num3 <= num2 && num3 <= num4) {
            pos1 = num3;
            if (num1 <= num2 && num1 <= num4) {
                pos2 = num1;
                if (num2 <= num4) {
                    pos3 = num2; pos4 = num4;
                } else {
                    pos3 = num4; pos4 = num2;
                }
            } else if (num2 <= num1 && num2 <= num4) {
                pos2 = num2;
                if (num1 <= num4) {
                    pos3 = num1; pos4 = num4;
                } else {
                    pos3 = num4; pos4 = num1;
                }
            } else {
                pos2 = num4;
                if (num1 <= num2) {
                    pos3 = num1; pos4 = num2;
                } else {
                    pos3 = num2; pos4 = num1;
                }
            }

        } else { // num4 es el menor
            pos1 = num4;
            if (num1 <= num2 && num1 <= num3) {
                pos2 = num1;
                if (num2 <= num3) {
                    pos3 = num2; pos4 = num3;
                } else {
                    pos3 = num3; pos4 = num2;
                }
            } else if (num2 <= num1 && num2 <= num3) {
                pos2 = num2;
                if (num1 <= num3) {
                    pos3 = num1; pos4 = num3;
                } else {
                    pos3 = num3; pos4 = num1;
                }
            } else {
                pos2 = num3;
                if (num1 <= num2) {
                    pos3 = num1; pos4 = num2;
                } else {
                    pos3 = num2; pos4 = num1;
                }
            }
        }

        System.out.println();
        System.out.println("El orden de los números introducidos es el " +
                pos1 + " / " + pos2 + " / " + pos3 + " / " + pos4);
        
        // TODO code application logic here
    }
    
}
