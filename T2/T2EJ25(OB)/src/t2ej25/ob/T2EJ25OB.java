/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ej25.ob;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T2EJ25OB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero");
        num1 = entrada.nextFloat();
        System.out.println("Por favor, introduzca el segundo numero");
        num2 = entrada.nextFloat();
        System.out.println("Por favor, introduzca el tercer numero");
        num3 = entrada.nextFloat();
        
        float suma = num1 + num2 + num3;
        
        float producto = num1 * num2 * num3;
        
        System.out.println("La suma es :" + suma);
        System.out.println("El producto es: " + producto);
        
        // TODO code application logic here
    }
    
}
