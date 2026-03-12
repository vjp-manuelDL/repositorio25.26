package ejercicio14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal del Ejercicio 14.
 * Gestiona un sistema de gestión de alumnos y asignaturas mediante menú interactivo.
 * Permite crear alumnos, mostrar notas, calcular mejor alumno y determinar asignatura más difícil.
 */
public class Ejercicio14 {

    /**
     * Método principal.
     * Controla el bucle del menú y ejecuta la opción seleccionada por el usuario.
     */
    public static void main(String[] args) {
        
        // Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Array con los nombres de las asignaturas del curso
        String[] asignaturas = {"Lengua", "Matemáticas", "Física"};
        
        // ArrayList que almacena los objetos Alumno de la clase
        ArrayList<Alumno> clase = new ArrayList<>();
        
        int opcion;
        
        // Bucle principal del menú
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    // Crear nuevo alumno con sus notas
                    rellenarAlumno(clase, asignaturas);
                    break;
                case 2:
                    // Mostrar listado de alumnos y sus calificaciones
                    mostrarAlumnos(clase);
                    break;
                case 3:
                    // Calcular y mostrar el alumno con mejor media
                    mejorAlumno(clase);
                    break;
                case 4:
                    // Determinar asignatura con más suspensos
                    asignaturaMasDificil(clase, asignaturas);
                    break;
                case 5:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
                default: 
                    System.out.println("Opcion invalida!");
            }
            
        } while(opcion != 5);
        
        scanner.close();  // Cerrar recurso Scanner
    }
    
    /**
     * Muestra el menú de opciones por consola.
     */
    public static void mostrarMenu() {
        System.out.println("--- MENU DE OPCIONES ---");
        System.out.println("1. - Crear un nuevo alumno");
        System.out.println("2. - Mostrar los alumnos y sus notas");
        System.out.println("3. - Mejor alumno de la clase");
        System.out.println("4. - Asignatura mas dificil");
        System.out.println("5. - Salir del programa");
    }
    
    /**
     * Crea un nuevo alumno, solicita sus notas y lo añade a la lista de la clase.
     */
    public static void rellenarAlumno(ArrayList<Alumno> clase, String[] asig) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = entrada.nextLine();
        
        // Crear objeto Alumno y rellenar sus notas
        Alumno al = new Alumno(nombre);
        al.rellenarNotas(asig);
        
        // Añadir alumno a la lista de la clase
        clase.add(al);
        System.out.println("El alumno ha sido creado correctamente");
    }
    
    /**
     * Muestra por consola todos los alumnos y sus notas.
     * Si la lista está vacía, informa al usuario.
     */
    public static void mostrarAlumnos(ArrayList<Alumno> clase) {
        if(clase.isEmpty()) {
            System.out.println("En esta clase no hay alumnos registrados");
        } else {
            System.out.println("--- Lista de alumnos ---");
            for(Alumno a : clase) {
                System.out.println("Alumno: " + a.getNombre());
                for(Asignatura as : a.getAsignaturas()) {
                    System.out.println("- " + as.getNombre() + ": " + as.getNota());
                }
            }
        }
    }
    
    /**
     * Calcula y muestra el alumno con la media de notas más alta.
     */
    public static void mejorAlumno(ArrayList<Alumno> clase) {
        if(clase.isEmpty()) {
            System.out.println("En esta clase no hay alumnos registrados.");
        } else {
            // Inicializar con el primer alumno como referencia
            Alumno mejor = clase.get(0);
            
            // Comparar medias de todos los alumnos
            for(Alumno al : clase) {
                if(al.calcularMeida() > mejor.calcularMeida()) {
                    mejor = al;
                }
            }
            
            System.out.println("El mejor alumno de la clase es: " + mejor.getNombre() + " con una media de " + mejor.calcularMeida());
        }
    }
    
    /**
     * Determina y muestra la asignatura con más suspensos (nota < 5).
     */
    public static void asignaturaMasDificil(ArrayList<Alumno> clase, String[] asignaturas) {
        if(clase.isEmpty()) {
            System.out.println("No hay alumnos registrados en esta clase.");
        } else {
            // Array para contar suspensos por asignatura (índice = posición en array asignaturas)
            int[] suspensos = new int[asignaturas.length];
            
            // Recorrer alumnos y contar suspensos por asignatura
            for(Alumno al : clase) {
                for(int i = 0; i < asignaturas.length; i++) {
                    if(al.getNotaPorPosicion(i) < 5) {
                        suspensos[i]++;
                    }
                }
            }
            
            // Buscar asignatura con máximo de suspensos
            int max = suspensos[0];
            String asignaturaDificil = asignaturas[0];
            
            for(int i = 1; i < suspensos.length; i++) {
                if(suspensos[i] > max) {
                    max = suspensos[i];
                    asignaturaDificil = asignaturas[i];
                }
            }
            System.out.println("La asignatura mas dificil es: " + asignaturaDificil + " con " + max + " suspensos");
        }
    }
}