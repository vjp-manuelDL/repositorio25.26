/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Cosas {

    public static int pedirCantidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el numero de numeros que vas a usar");
        return entrada.nextInt();
    }
    
    public static void procesarNumeros(int n, Scanner entrada){
        double suma = 0;
        double numero;
        double mayor = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        
        for (int i = 1; i <=n; i++){
            System.out.println("Introduce el numero " + i);
            numero = entrada.nextDouble();
            suma += numero;
            mayor = Math.max(mayor, numero);
            menor = Math.min( menor, numero);
            
        }
        double media = suma / n;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        
    }
}
