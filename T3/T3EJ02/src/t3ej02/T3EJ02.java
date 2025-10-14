/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej02;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3EJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);/* Preparo el scanner
        y las variables de los numeros y la suma y producto
        */
        float num1;
        float num2;
        float suma;
        float prod;
        
        System.out.println("Escribe el primer numero: ");
        num1 = entrada.nextFloat();
        
        System.out.println("Escribe el segundo numero: ");
        num2 = entrada.nextFloat();
        
        suma = num1 + num2;
        prod = num1 * num2;
        /*Creo la condiciones para si num1 es mayor o menor que 10 
        y su respectiva operacion matematica
        */
        if (num1 < 10){
            System.out.println("El resultado de la suma es: " + suma);
        }else if (num1 > 10){
            System.out.println("El resultado del producto es: " + prod);}
        }
        
        // TODO code application logic here
    }
    

