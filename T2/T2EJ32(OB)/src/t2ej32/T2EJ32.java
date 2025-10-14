/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ej32;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T2EJ32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int dinero;
        System.out.println("Escribe el dinero que quieres cambiar: ");
        dinero = entrada.nextInt();
        
        int b50 = dinero /50;
        int b20 = dinero % 50 / 20;
        int b10 = dinero % 50 %20 /10;
        int b5  = dinero % 50 %20 % 10 /5;
        int m2 = dinero % 50 %20 % 10 % 5 /2;
        int m1 = dinero % 50 %20 % 10 % 5 % 2 % 1;
        
        System.out.println("Necesitas " + b50 + " billetes de 50; " +
        b20 + " billetes de 20, " + b10 + " billetes de 10, " + b5 + 
                " billetes de 5" + m2 + " monedas de 2 euros " + " y " + 
                m1 + " mondedas de 1 euro");
                
        
        
        // TODO code application logic here
    }
    
}
