/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej27;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3EJ27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1;
        float num2;
        int menu;
        float resultado = 0;
        
        System.out.println("Escribe el primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Escribe el segundo numero:");
        num2 = entrada.nextInt();
        
        do{
            System.out.println("Elija la accion que desea realizar:" +
                    "1:SUMA/" + "2:RESTA/" + "3:MULTIPLICAR/" + "4:DIVIDIR/" + "5:SALIR");
            menu = entrada.nextInt();
            
            if (menu == 1)System.out.println("El resultado es:" + (num1+num2));
            if (menu == 2)System.out.println("El resultado es:" + (num1-num2));
            if (menu == 3)System.out.println("El resultado es:" + (num1*num2));
            if (menu == 4){
                try {
            resultado = num1 / num2;
        }
        catch(ArithmeticException e){
            System.err.println("Error no se puede dividir entre cero");
            resultado = 0;
            
        }
        System.out.println("El resultado es: " + resultado);
            }
            
            
            
        }while (menu < 5);
        System.out.println("Usted salio del menu");
        
        
        
        
        // TODO code application logic here
    }
    
}
