/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej06;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T3EJ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        
        System.out.println("Escribe tu nota:");
        nota = entrada.nextInt();
        
        if (nota<0 || nota >10){
            System.out.println("Dato incorrecto");}
         else if (nota >= 0 && nota<5){
            System.out.println("Suspenso");
        } else if (nota>=5 && nota<=6){
            System.out.println("Bien");
        } else if (nota >=7 && nota<=8){
            System.out.println("Notable");
        } else if (nota >= 9 && nota <=10){
            System.out.println("Sobresaliente");
        } 
        
        // TODO code application logic here
    }
    
}
