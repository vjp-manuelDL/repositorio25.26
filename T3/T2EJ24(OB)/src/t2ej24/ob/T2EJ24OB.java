/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ej24.ob;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T2EJ24OB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float ing;
        float prog;
        float lms;
        float bases;
        float ent;
        float sis;
        float ipe;
        float media;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la nota de ingles : ");
        ing = entrada.nextFloat();
        System.out.println("Introduce la nota de programacion : ");
        prog = entrada.nextFloat();
        System.out.println("Introduce la nota de lenguaje : ");
        lms = entrada.nextFloat();
        System.out.println("Introduce la nota de bases : ");
        bases = entrada.nextFloat();
        System.out.println("Introduce la nota de entorno : ");
        ent = entrada.nextFloat();
        System.out.println("Introduce la nota de sistemas : ");
        sis = entrada.nextFloat();
        System.out.println("Introduce la nota de IPE : ");
        ipe = entrada.nextFloat();
       
        
        media = (float) (ing + prog + lms + bases + ent + sis + ipe)/7;
        System.out.println("La media de todo es: " + media);
        
        
        // TODO code application logic here
    }
    
}
