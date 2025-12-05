/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el nombre de la Descarga");
        String nombre = entrada.nextLine();
        return nombre;

    }

    public static double pedirTamaño() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el tamaño de la Descarga");
        double tamaño = entrada.nextDouble();
        return tamaño;

    }

    public static int pedirVelocidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba la velocidad de la Descarga");
        int velocidad = entrada.nextInt();
        return velocidad;

    }
    public static void calculoDatos(Descarga objeto){
        String nombre = objeto.getNombre();
        double tam = objeto.getTamaño();
        int vel = objeto.getVelocidad();
        double tiempo;
        
        tiempo = ((tam * 8) / vel )/ 60;
        
        System.out.println(nombre + " tardara: " + tiempo);
            
        }
    }
    
    


