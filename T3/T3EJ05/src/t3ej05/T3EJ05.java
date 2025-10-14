/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej05;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3EJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        
        System.out.println("Escribe e numero que quieres comprobar si es par o impar:");
        num1 = entrada.nextInt();
        
        if (num1 % 2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
        
        
        // TODO code application logic here
    }
    
}
