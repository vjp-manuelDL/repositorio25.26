/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej18;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class T3EJ18 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Hago el scanner y las variables de contraseña,
        el numero introducido y reseteo los intentos a 0
        */
        Scanner entrada = new Scanner(System.in); 
        int contraseña = 1234;
        int intentos = 0;
        int introduzco;
        //Hago el bucle con 3 intentos
        do{
            System.out.println("Escribe tu contraseña:");
            introduzco = entrada.nextInt();
            
            if (contraseña == introduzco){
                System.out.println("¡Enhorabuena contraseña correcta!");
                break; //para no seguir en el bucle si se acertó
            } else {
                System.out.println("Contraseña incorrecta!");
                intentos++;}
        } while (intentos < 3);
        
        if (intentos == 3){
            System.out.println("¡ERROR! Acceso denegado");
        }
// TODO code application logic here
    }
    
}
