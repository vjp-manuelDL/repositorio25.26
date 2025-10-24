/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej02;

import java.util.Scanner;
import t4ej02.Sumar;


/**
 *
 * @author alumno
 */

public class T4EJ02 {

    public class Multiplicar {

        public static void producto(float num1, float num2) {
            float result1 = num1 * num2;
            System.out.println("La operación que se realizó es producto");
            System.out.println("El resultado del producto es: " + result1);
        }
    }




        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1;
        float num2;

        System.out.println("Por favor, introduzca el primer numero:");
        num1 = entrada.nextFloat();
        System.out.println("Por favor, introduzca el segundo numero:");
        num2 = entrada.nextFloat();
        
        if (num1 > 10){ Multiplicar.producto(num1, num2);}
        else { Sumar.suma(num1, num2);}
        // TODO code application logic here
    }

    }
