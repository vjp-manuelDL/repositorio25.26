/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej03;
import java.util.Scanner;
import t4ej03.Organizar;


/**
 *
 * @author alumno
 */
public class T4EJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        
        System.out.println("Por favor, introduzca el primer numero:");
        num1 = entrada.nextFloat();
        System.out.println("Por favor, introduzca el segundo numero:");
        num2 = entrada.nextFloat();
        System.out.println("Por favor, introduzca el tercer numero:");
        num3 = entrada.nextFloat();
        
        Organizar.numeroMayor(num1, num2, num3);
        
        
        // TODO code application logic here
    }
    
}
