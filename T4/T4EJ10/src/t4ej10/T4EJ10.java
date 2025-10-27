/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej10;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ10 {
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        int dato;
        System.out.println("Escriba el numero del que quiere saber la tabla");
        dato = entrada.nextInt();
        return dato;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num2 = 0;
        int num3;
        int num1 = T4EJ10.pedirNumero();
        
        System.err.println("La tabla del numero " + num1 + " es: ");
        
        do {
            num3 = num1 * num2;
            System.out.println(num3 );
            num2++;
            
        } while (num2 < 11);
        // TODO code application logic here
    }
    
}
