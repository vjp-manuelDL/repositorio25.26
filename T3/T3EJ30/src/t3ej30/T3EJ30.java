/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej30;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3EJ30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                int aleatorio = (int)((Math.random())*100+1);
        int numero;
        int intentos = 0;
        
        do{
            System.out.println("Escribe el numero que crees que es");
            numero = entrada.nextInt();            
            
            if (aleatorio < numero){System.out.println("El numero es menor");}
            if (aleatorio > numero){System.out.println("El numero es mayor");}
            if (aleatorio == numero) {System.out.println("Enhorabuena acertaste");}
            
            try{
                numero = char;
                
                
                
            }
            
            
            
            
            
            
            
            
            
            
            intentos++;
            
            }while (numero != aleatorio);
        System.out.println("El numero de intentos han sido: " + intentos);
        
        
        
        // TODO code application logic here
    }
    
}
