/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ej26.ob;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T2EJ26OB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        System.out.println("Escribe un numero de 4 Cifras ");
        num1 = entrada.nextInt();
        
        int prim = num1 /1000;
        int seg = num1 /100 % 10;
        int ter = (num1 / 10) % 10;
        int cuar = num1 % 10;
        
        System.out.println("El primer numero es: " + prim);
        System.out.println("El segundo numero es: " + seg);
        System.out.println("El tercer numero es: " + ter);
        System.out.println("El cuarto numero es: " + cuar);

    }
    
}
