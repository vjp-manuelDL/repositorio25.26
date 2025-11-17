/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_2;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
Ejercicio 26 (Entregable): Pedir un número de 4 cifras y mostrar cada dígito por separado.
→ Refuerza uso de / y % con números enteros.
        */
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe el numero de 4 CIFRAS a descomponer digito a digito: ");
        int numero = entrada.nextInt();
        
        int cif1;
        int cif2;
        int cif3;
        int cif4;
        
        cif1 = numero / 1000;
        cif2 = numero /100 % 10;
        cif3 = numero % 100 / 10;
        cif4 = numero % 10;
        
        System.out.println("Las cifras son:" );
        System.out.println("Cifra 1: " + cif1);
        System.out.println("Cifra 2: " + cif2);
        System.out.println("Cifra 3: " + cif3);
        System.out.println("Cifra 4: " + cif4);
    }
    
}
