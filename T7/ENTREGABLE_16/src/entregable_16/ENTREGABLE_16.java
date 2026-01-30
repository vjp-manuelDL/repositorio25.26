package entregable_16;

import java.util.Scanner;

public class ENTREGABLE_16 {
    
     public static final int NUM_ALUMNOS = 6;
    public static final int NUM_ASIGNATURAS = 4;

    public static void main(String[] args) {
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        double[][] notas = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];

        Scanner entrada = new Scanner(System.in);
        boolean datosRellenados = false;
        int opcion;

        do {
            System.out.println();
            System.out.println("1. Rellenar las notas de los alumnos.");
            System.out.println("2. Mostrar las notas introducidas.");
            System.out.println("3. Alumno mejor de la clase (mayor media).");
            System.out.println("4. Alumno con mas suspensos.");
            System.out.println("5. Asignatura mas dificil (menor media).");
            System.out.println("6. Salir del programa.");
            System.out.print("Elige una opcion: ");

            opcion = entrada.nextInt();

            if (opcion == 1) {
                rellenarNotas(notas, alumnos, asignaturas, entrada);
                datosRellenados = true;
            }
            else if (opcion == 2) {
                if (datosRellenados) {
                    mostrarNotas(notas, alumnos, asignaturas);
                } else {
                    System.out.println("Primero debes rellenar las notas.");
                }
            }
            else if (opcion == 3) {
                if (datosRellenados) {
                    alumnoMejor(notas, alumnos);
                } else {
                    System.out.println("Primero debes rellenar las notas.");
                }
            }
            else if (opcion == 4) {
                if (datosRellenados) {
                    alumnoMasSuspensos(notas, alumnos);
                } else {
                    System.out.println("Primero debes rellenar las notas.");
                }
            }
            else if (opcion == 5) {
                if (datosRellenados) {
                    asignaturaMasDificil(notas, asignaturas);
                } else {
                    System.out.println("Primero debes rellenar las notas.");
                }
            }
            else if (opcion == 6) {
                System.out.println("Saliendo del programa");
            }
            else {
                System.out.println("Opcion no valida.");
            }

        } while (opcion != 6);

        entrada.close();
    }

    public static void rellenarNotas(double[][] notas, String[] alumnos, String[] asignaturas, Scanner sc) {
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.println("Introduciendo notas para " + alumnos[i] + ":");
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                double nota;
                do {
                    System.out.print("  Nota en " + asignaturas[j] + " (0-10): ");
                    nota = sc.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("    La nota debe estar entre 0 y 10.");
                    }
                } while (nota < 0 || nota > 10);
                notas[i][j] = nota;
            }
        }
        System.out.println("Notas introducidas correctamente.");
    }

    public static void mostrarNotas(double[][] notas, String[] alumnos, String[] asignaturas) {
        System.out.println();
        System.out.print("Alumno      ");
        for (int j = 0; j < NUM_ASIGNATURAS; j++) {
            System.out.print(asignaturas[j]);
            if (j < NUM_ASIGNATURAS - 1) {
                System.out.print("       ");
            }
        }
        System.out.println();

        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.print(alumnos[i]);
            for (int k = alumnos[i].length(); k < 12; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                System.out.print(notas[i][j]);
                if (notas[i][j] < 10) {
                    System.out.print("        ");
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }
    }

    public static double calcularMediaAlumno(double[][] notas, int indiceAlumno) {
        double suma = 0;
        for (int j = 0; j < NUM_ASIGNATURAS; j++) {
            suma = suma + notas[indiceAlumno][j];
        }
        return suma / NUM_ASIGNATURAS;
    }

    public static double calcularMediaAsignatura(double[][] notas, int indiceAsignatura) {
        double suma = 0;
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            suma = suma + notas[i][indiceAsignatura];
        }
        return suma / NUM_ALUMNOS;
    }

    public static void alumnoMejor(double[][] notas, String[] alumnos) {
        double mejorMedia = -1;
        String mejorAlumno = "";
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            double media = calcularMediaAlumno(notas, i);
            if (media > mejorMedia) {
                mejorMedia = media;
                mejorAlumno = alumnos[i];
            }
        }
        System.out.println();
        System.out.println("El mejor alumno es " + mejorAlumno + " con una media de " + mejorMedia);
    }

    public static void alumnoMasSuspensos(double[][] notas, String[] alumnos) {
        int maxSuspensos = -1;
        String alumnoConMas = "";
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            int suspensos = 0;
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                if (notas[i][j] < 5) {
                    suspensos = suspensos + 1;
                }
            }
            if (suspensos > maxSuspensos) {
                maxSuspensos = suspensos;
                alumnoConMas = alumnos[i];
            }
        }
        System.out.println();
        System.out.println("El alumno con mas suspensos es " + alumnoConMas + " (" + maxSuspensos + " suspensos).");
    }

    public static void asignaturaMasDificil(double[][] notas, String[] asignaturas) {
        double menorMedia = 100;
        String asignaturaDificil = "";
        for (int j = 0; j < NUM_ASIGNATURAS; j++) {
            double media = calcularMediaAsignatura(notas, j);
            if (media < menorMedia) {
                menorMedia = media;
                asignaturaDificil = asignaturas[j];
            }
        }
        System.out.println();
        System.out.println("La asignatura mas dificil es " + asignaturaDificil + " con una media de " + menorMedia);
    }
}