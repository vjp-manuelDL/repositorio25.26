/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_8;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menus {
    
    
    public static double pedirDist(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los metros que quieres convertir");
        double dist = entrada.nextDouble();
        return dist;
    }
    
    public static void mostarMenu(){
        System.out.println("---MENU---");
        System.out.println("1-Convertir a KM");
        System.out.println("2-Convertir a cm");
        System.out.println("3-Convertir a mm");
        System.out.println("4-Salir ");
    }
    public static double aKilometros(double metros){
        return metros / 1000;
    }
    
    public static double aCenti(double metros){
        return metros * 100;
    }
     public static double aMili(double metros){
        return metros * 1000;
    }
}
