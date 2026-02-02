package t8ej09;
import java.util.Scanner;


/*
Clase creada para solo usar el main para llamar a acciones
(Ayuda de la IA)
*/
public class Aula {
    private static final String[] NOMBRES_ALUMNOS = {"Pepe", "Juan", "Marta"};
    private static final String[] NOMBRES_ASIGNATURAS = {"Lengua", "Mates", "Historia", "Fisica"};
    private static Alumno[] alumnos = new Alumno[3];

    public static void inicializarAula() {
        for (int i = 0; i < NOMBRES_ALUMNOS.length; i++) {
            alumnos[i] = new Alumno(NOMBRES_ALUMNOS[i], NOMBRES_ASIGNATURAS);
        }
    }

    public static void rellenarNotas(Scanner entrada) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("\n--- " + alumnos[i].getNombreAlumno() + " ---");
            Asignatura[] asignaturas = alumnos[i].getAsignaturas();
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.print("Introduzca nota de " + asignaturas[j].getNombreAsignatura() + ": ");
                float nota = entrada.nextFloat();
                entrada.nextLine();
                asignaturas[j].setNotaAsignatura(nota);
            }
        }
        System.out.println("\nNotas guardadas correctamente.");
    }

    public static void mostrarNotas() {
        System.out.println("\n--- NOTAS DE LOS ALUMNOS ---");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("\n" + alumnos[i].getNombreAlumno() + ":");
            Asignatura[] asignaturas = alumnos[i].getAsignaturas();
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.println("  " + asignaturas[j].getNombreAsignatura() + ": " + asignaturas[j].getNotaAsignatura());
            }
            System.out.println("  MEDIA: " + alumnos[i].calcularMedia());
        }
    }

    public static void mostrarMejorAlumno() {
        int mejorIndice = 0;
        float mejorMedia = alumnos[0].calcularMedia();

        for (int i = 1; i < alumnos.length; i++) {
            float mediaActual = alumnos[i].calcularMedia();
            if (mediaActual > mejorMedia) {
                mejorMedia = mediaActual;
                mejorIndice = i;
            }
        }

        System.out.println("\nEl mejor alumno es " + alumnos[mejorIndice].getNombreAlumno() + 
                           " con una media de " + mejorMedia);
    }

    public static void mostrarAlumnoMasSuspensos() {
        int peorIndice = 0;
        int maxSuspensos = alumnos[0].contarSuspensos();

        for (int i = 1; i < alumnos.length; i++) {
            int suspensosActual = alumnos[i].contarSuspensos();
            if (suspensosActual > maxSuspensos) {
                maxSuspensos = suspensosActual;
                peorIndice = i;
            }
        }

        System.out.println("\nEl alumno con mas suspensos es " + alumnos[peorIndice].getNombreAlumno() + 
                           " con " + maxSuspensos + " suspensos");
    }

    public static void mostrarAsignaturaMasDificil() {
        float[] medias = new float[NOMBRES_ASIGNATURAS.length];

        for (int j = 0; j < NOMBRES_ASIGNATURAS.length; j++) {
            float suma = 0;
            for (int i = 0; i < alumnos.length; i++) {
                suma = suma + alumnos[i].getAsignaturas()[j].getNotaAsignatura();
            }
            medias[j] = suma / alumnos.length;
        }

        int indiceDificil = 0;
        float menorMedia = medias[0];
        for (int j = 1; j < medias.length; j++) {
            if (medias[j] < menorMedia) {
                menorMedia = medias[j];
                indiceDificil = j;
            }
        }

        System.out.println("\nLa asignatura mas dificil es " + NOMBRES_ASIGNATURAS[indiceDificil] + 
                           " con una media de " + menorMedia);
    }
}