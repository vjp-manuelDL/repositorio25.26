/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej15;
import  java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3EJ15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        int numero;
        int i;
        
        System.out.println("Escribe el numero del cual quieres saber la tabla");
        numero = entrada.nextInt();
        
        for(i = 0; i <=10; i++){
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " es: " + resultado);
        }
        
        // TODO code application logic here
    }
    
}
