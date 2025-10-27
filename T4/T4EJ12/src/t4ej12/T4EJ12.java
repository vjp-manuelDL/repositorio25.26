/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej12;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ12 {
    public static int pedirContra(){
    Scanner entrada = new Scanner(System.in);
    int contra;
            System.out.println("Escribe la contraseña de 4 digitos");
            contra = entrada.nextInt();
            return contra;
}
        public static int comproBar(){
            int intentos = 0;
            int dato = T4EJ12.pedirContra();
            boolean contra = false;
            int acertar = 1234;
            while (intentos < 3){
                if ( contra != false){
                    int 
                }
                
            }
        }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
