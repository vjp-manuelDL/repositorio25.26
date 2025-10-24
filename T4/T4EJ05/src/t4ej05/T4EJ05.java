/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej05;
import java.util.Scanner;
import t4ej05.Checker;

/**
 *
 * @author alumno
 */
public class T4EJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Introduzca el numero a comprobar:");
        numero = entrada.nextInt();
        
        Checker.parOImpar(numero);
        // TODO code application logic here
    }
    
}
