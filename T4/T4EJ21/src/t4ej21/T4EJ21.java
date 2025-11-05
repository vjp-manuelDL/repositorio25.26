/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej21;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T4EJ21 {

    public static int pedirNUM1() {
        Scanner entrada = new Scanner(System.in);
        int num1;
        System.out.println("Escribe el primer numero");
        num1 = entrada.nextInt();
        return num1;
    }
    public static void sumarPares(int a, int b){
        int suma = 0;
        while (a <= b){
            if (a % 2 == 0){
                suma += a;
            }
            a++;
        }
        System.out.println("La suma es: " + suma);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = pedirNUM1();
        int num2;
        do {
            System.out.println("Escribe el segundo numero");
            num2 = entrada.nextInt();
        }while (num2 < num1);
        
        sumarPares(num1, num2);
    
            
        
        // TODO code application logic here
    }

}
