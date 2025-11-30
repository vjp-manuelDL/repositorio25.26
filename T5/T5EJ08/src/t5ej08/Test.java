/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej08;

import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author Admin
 */
public class Test {

    

    public static void probarNum() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        double valor = entrada.nextDouble();
        
        Numero num = new Numero(valor);
        mostrarParOImpar(num);
        entrada.nextLine();
    }
    
    public static void mostrarParOImpar(Numero n){
        if(n.getValor() % 2 == 0){
            System.out.println("El numero es par"); 
        }
        else{
            System.out.println("El numero es impar");
        }
        
    }
    
    
}
