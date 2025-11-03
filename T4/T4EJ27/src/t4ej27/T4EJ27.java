/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej27;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ27 {
    public final static String RESPUESTA_1 = "cara";
    public final static String RESPUESTA_2 = "cruz";
    
    public static int lanZamiento(){
        int random = 0;
        random = (int) (Math.random()*2);
        return random;
    }
    
        public static String pedirLado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el lado");
        return entrada.nextLine();
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = T4EJ27.lanZamiento();
        boolean cara = false;
        
        
        
        
        if (num == 0){
            cara = true;
        }
        else { cara = false;}
        
        // TODO code application logic here
    }
    
}
