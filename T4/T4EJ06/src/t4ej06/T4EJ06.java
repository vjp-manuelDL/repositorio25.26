/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej06;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        
        System.out.println("Escribe la nota a comprobar:");
        nota = entrada.nextInt();
        
        Comprobar.comprobarNota(nota);
        // TODO code application logic here
    }
    
}
