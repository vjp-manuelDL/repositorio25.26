package t5ej05;

import java.util.Scanner;

/**
 * Clase principal para gestionar las notas de las asignaturas del ciclo.
 */
public class T5EJ05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Crear las asignaturas
        Asignaturas[] asignaturas = {
            new Asignaturas("Programacion"),
            new Asignaturas("Lenguajes de Marcas"),
            new Asignaturas("Bases de Datos"),
            new Asignaturas("Entornos de Desarrollo"),
            new Asignaturas("Sistemas Informaticos"),
            new Asignaturas("Formacion y Orientacion Laboral")
        };

        // Pedir las notas
        for (Asignaturas asig : asignaturas) {
            System.out.print("Introduzca la nota de " + asig.obtenerNombre() + ": ");
            double nota = entrada.nextDouble();
            // Opcional: validar rango (0-10)
            while (nota < 0 || nota > 10) {
                System.out.print("Nota inválida. Debe estar entre 0 y 10. Intente de nuevo: ");
                nota = entrada.nextDouble();
            }
            asig.establecerNota(nota);
        }

        // Calcular y mostrar la media
        double suma = 0;
        for (Asignaturas asig : asignaturas) {
            suma += asig.obtenerNota();
        }
        double media = suma / asignaturas.length;

        System.out.printf("Su nota media del curso es: %.2f%n", media);
        
        entrada.close();
    }
}