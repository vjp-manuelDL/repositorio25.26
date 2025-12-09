/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    public static void probarTest() {
        Scanner entrada = new Scanner(System.in);
        
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        Numero num3 = new Numero();
        
                
        System.out.println("Escribe el primer numero");
        num1.setValor(entrada.nextDouble());
        System.out.println("Escribe el segundo numero");
        num2.setValor(entrada.nextDouble());
        System.out.println("Escribe el tercer numero");
        num3.setValor(entrada.nextDouble());
        
        double v1 = num1.getValor();
        double v2 = num2.getValor();
        double v3 = num3.getValor();
        
        
        if (v1 > v2 || v1 > v3) {
            System.out.println("Numero " + v1 + " es el mayor");
            
        }
                
        else if (v2 > v1 || v2 > v3) {
            System.out.println("Numero " + num2.getValor() + " es el mayor");
            
        }
                
        else if (v3 > v2 || v1 < v3) {
            System.out.println("Numero " + v3 + " es el mayor");
            
        }

    }
}
