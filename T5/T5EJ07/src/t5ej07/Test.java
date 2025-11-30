/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej07;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Test {
    public static String pedirNombre(){
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el nombre");
        nombre = entrada.nextLine();
        return nombre;
    }
        public static double pedirTam(){
        double tam;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el tamaño");
        tam = entrada.nextDouble();
        entrada.hasNextLine();
        return tam;
    }
        public static double pedirVelocidad(){
        double vel;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe la velocidad");
        vel = entrada.nextDouble();
        entrada.nextLine();
        return vel;
    }
        
        public static void calcularTiempo(Descarga objeto) {
            String nombre = objeto.obtenerNombre();
            double tamano = objeto.obtenerTam();
            double velocidad = objeto.obtenerVelo();
            double tiempo;
            
            tiempo=((tamano * 8)/velocidad / 60);
            System.out.println(nombre + "tardara en descargarse " + tiempo + "minutos");
        
    }
        
        
    
    
}
