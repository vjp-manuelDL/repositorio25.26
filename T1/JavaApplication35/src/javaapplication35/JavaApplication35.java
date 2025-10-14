/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int dia;
        System.out.println("Escribe un numero");
        dia = entrada.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Holaa");
                
            case 2:
                System.out.println("Error");
                break;
            default:
                System.out.println("Escribe de nuevo");
        }
        
            
        // TODO code application logic here
    }
    
}
