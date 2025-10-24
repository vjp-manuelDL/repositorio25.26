/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej08;
import java.util.Scanner;
import t4ej08.Entropy;

/**
 *
 * @author alumno
 */
public class T4EJ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dinero = 0;
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int m2 = 0;
        int m1 = 0;
        
        System.out.println("Escribe la cantidad de dinero que quieres convertir:");
        dinero = entrada.nextInt();
        
        Entropy.eljass(dinero, b50, b20, b10, m2, m1);
        
        // TODO code application logic here
    }
    
}
