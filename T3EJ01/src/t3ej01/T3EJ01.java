/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej01;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3EJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
         Scanner entrada = new  Scanner(System.in);
         float numero;
         System.out.println("Escribe un numero: ");
         numero = entrada.nextFloat();
         if(numero <0){
             System.out.println("El numero es negativo");   
         }else if(numero>0){
             System.out.println("El numero es positivo");
         }
    }
    
}
