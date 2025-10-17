/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej21;
import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author alumno
 */
public class T3EJ21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numerador;
        float denominador;
        float resultado = 0;
        System.out.println("Escribe el numerador");
        numerador = entrada.nextInt();
         System.out.println("Escribe el denominador");
        denominador = entrada.nextInt();
        
        //Creo las variables para la division
        try {
            resultado = numerador / denominador;
        }
        catch(ArithmeticException e){
            System.err.println("Error no se puede dividir entre cero");
            resultado = 0;
            
        }
        System.out.println("El resultado es: " + resultado);
            
        
        // TODO code application logic here
    }
    
}
