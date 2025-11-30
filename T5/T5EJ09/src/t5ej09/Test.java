/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej09;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    public static void encontrarMayorYmenor() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        int n1 = entrada.nextInt();
        System.out.println("Escribe el segundo numero");
        int n2 = entrada.nextInt();
        System.out.println("Escribe el tercer numero");
        int n3 = entrada.nextInt();
        
        Numero num1 = new Numero(n1);
        Numero num2 = new Numero(n2);
        Numero num3 = new Numero(n3);
        
        int mayor = num1.getValor();
        
        if(num2.getValor() > mayor){
            mayor = num2.getValor();
        }
        if (num3.getValor() > mayor){
            mayor = num3.getValor();
        }
        
        System.out.println("El numero mayor es: " + mayor);
    }

}
