/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej07;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T5EJ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String respuesta;
        String nomDes;
        double tamDes;
        double velDes;
        
        do {            
            nomDes = Test.pedirNombre();
            tamDes = Test.pedirTam();
            velDes= Test.pedirVelocidad();
            Descarga descarga = new Descarga(nomDes, tamDes, velDes);
            Test.calcularTiempo(descarga);
            System.out.println("Desea crear otro objeto?");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
    }
    
}
