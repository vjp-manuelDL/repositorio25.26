/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej09;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T3EJ09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1; //Definir los numeros y la variable temporal
        int num2;
        int num3;
        int num4;
        int temp;
        
        System.out.println("Escribe el primer numero: "); //Pedir los numeros al cliente
        num1 = entrada.nextInt();
        
        System.out.println("Escribe el Segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Escribe el tercer numero: ");
        num3 = entrada.nextInt();
        
        System.out.println("Escribe el cuarto numero: ");
        num4 = entrada.nextInt();
        
        //Ordenarlos
        
        if (num1 > num2) { temp = num1; num1 = num2; num2 = temp; } 
        if (num1 > num3) { temp = num1; num1 = num3; num3 = temp; }
        if (num1 > num4) { temp = num1; num1 = num4; num4 = temp; }
        
        /* lo que hacemos en estas lineas es ir buscando el menor de todos.
        Si es mayor el numero lo guardamos en la variable de otro numero y así
        Si el 1 es mayor que el 2, el 2 pasa a ser 1 y el 1 2...
        */
        if (num2 > num3) { temp = num2; num2 = num3; num3 = temp; }
        if (num2 > num4) { temp = num2; num2 = num4; num4 = temp; }
        // hacemos lo mismo pero con los numeros 2 y 3 
        
        if (num3 > num4) { temp = num3; num3 = num4; num4 = temp; }
        
        System.out.println("El orden ascendente es: " + num1 + " / " + num2 + " / "
        + num3 + " / " + num4);
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
