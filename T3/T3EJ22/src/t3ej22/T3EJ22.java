/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej22;
import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author alumno
 */
public class T3EJ22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
        
        try{
            System.out.println("Escribe el primer numero");
            num1 = entrada.nextInt();
            System.out.println("Escribe el segundo numero");
            num2 = entrada.nextInt();
            
            resultado = num1 + num2;
            
            System.out.println("El resultado es: " + resultado);
            
        } catch (Exception e){
            System.out.println("Error. Debes escribir solo numeros");
        }
        
        // TODO code application logic here
    }
    
}
