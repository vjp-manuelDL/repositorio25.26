/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej17;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ17 {
    public static double letraRandom(){
        double codigoASCII = Math.floor((Math.random())*122 + 97);
        return  codigoASCII;
    }
    
    public static char letraIntro(){
        Scanner entrada = new Scanner(System.in);
        char letra = entrada.nextLine().charAt(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
