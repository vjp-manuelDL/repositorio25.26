/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ej23;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class T2EJ23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float precio;
        long cantidad;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce precio del producto: ");
        precio = entrada.nextFloat();
        
        System.out.println("Muy bien, ahora dime la cantidad de productos que quieres comprar");
        cantidad = entrada.nextLong();
        
        Float total = precio * cantidad;
        System.out.println("El precio total es: " + total + "$");
        
        // TODO code application logic here
    }
    
}
