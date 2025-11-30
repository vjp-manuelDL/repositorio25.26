/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej16;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    public static void procesarAlumnos(){
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 1;i <=3; i++){
            System.out.println("Alumno: " + i);
            
            // Pedir nombre
            System.out.print("Introduzca el nombre: ");
            String nombre = entrada.nextLine();

            // Pedir nota (con validación)
            int nota;
            do {
                System.out.print("Introduzca la nota (0-10): ");
                while (!entrada.hasNextInt()) {
                    System.out.println("⚠️ Error: debe introducir un número entero.");
                    entrada.next(); // descartar entrada no válida
                }
                nota = entrada.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("⚠️ Error: la nota debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);
            entrada.nextLine();
            
            Alumno alumno = new Alumno(nombre, nota);
            
            System.out.println(alumno.getNombre() + ": su nota: " + alumno.getNota());

        }
    }
}
