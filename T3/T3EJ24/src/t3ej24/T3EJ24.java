/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej24;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3EJ24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = 1;
        int num2;
        
        System.out.println("Escribe el numero hasta el que quieres comprobar: ");
        num2 = entrada.nextInt();
        
        do{
            if (num1 % 3 == 0)
                System.out.print(num1 + "/");
            num1++;
                    
        } while (num1 <= num2);
        
        
                
        
        // TODO code application logic here
    }
    
}
