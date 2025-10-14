/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej21t2.ob;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EJ21T2OB {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long introducir;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce los segundos que quiere convertir: ");
        introducir = entrada.nextLong();
        
        long dias = introducir / 86400;
        long horas = introducir % 86400 / 3600;
        long minutos = introducir % 86400 % 3600 / 60;
        long segundos = introducir % 86400 % 3600 % 60; 
        
          System.out.println(
            introducir + " segundos hacen un total de: " +
            dias + " días, " +
            horas + " horas, " +
            minutos + " minutos y " +
            segundos + " segundos."
        );
        
        
        
        // TODO code application logic here
    }
    
}
