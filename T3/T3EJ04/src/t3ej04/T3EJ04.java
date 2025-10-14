/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej04;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3EJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float num1;
        float num2;
        float num3;
        System.out.println("Escribe el primer numero;");
        num1 = entrada.nextFloat();
        System.out.println("Escribe el segundo numero;");
        num2 = entrada.nextFloat();
        System.out.println("Escribe el tercer numero;");
        num3 = entrada.nextFloat();
        
        if(num1 < num2 && num1 < num3){
            System.out.println("El numero mayor es: " + num1);}
        else if(num2 < num1 && num2 < num3){
            System.out.println("El numero mayo es: " + num2);}
        else if(num3 < num1 && num3 < num2){
            System.out.println("El numero mayor es: " + num3);}
        // TODO code application logic here
    }
    
}
