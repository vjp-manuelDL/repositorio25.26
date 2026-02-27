package t10_ej07;

import java.util.Scanner;

public class T10_EJ07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] temperaturas = new int[4][7];
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int opcion;
        boolean rellenado = false;

        do {
            System.out.println("\n1. Rellenar temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Temperatura media del mes");
            System.out.println("4. Dia/s mas caluroso/s");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    for (int s = 0; s < 4; s++) {
                        System.out.println("Semana " + (s + 1) + ":");
                        for (int d = 0; d < 7; d++) {
                            System.out.print(dias[d] + ": ");
                            temperaturas[s][d] = sc.nextInt();
                        }
                    }
                    rellenado = true;
                    break;

                case 2:
                    if (rellenado) {
                        for (int s = 0; s < 4; s++) {
                            System.out.println("Semana " + (s + 1) + ":");
                            for (int d = 0; d < 7; d++) {
                                System.out.println("  " + dias[d] + ": " + temperaturas[s][d] + "GRADOS");
                            }
                        }
                    } else {
                        System.out.println("Primero rellena las temperaturas");
                    }
                    break;

                case 3:
                    if (rellenado) {
                        int suma = 0;
                        for (int s = 0; s < 4; s++) {
                            for (int d = 0; d < 7; d++) {
                                suma += temperaturas[s][d];
                            }
                        }
                        System.out.println("Media: " + (suma / 28.0) + "GRADOS");
                    } else {
                        System.out.println("Primero rellena las temperaturas");
                    }
                    break;

                case 4:
                    if (rellenado) {
                        int max = temperaturas[0][0];
                        for (int s = 0; s < 4; s++) {
                            for (int d = 0; d < 7; d++) {
                                if (temperaturas[s][d] > max) {
                                    max = temperaturas[s][d];
                                }
                            }
                        }
                        System.out.println("Dia/s mas caluroso/s (" + max + "GRADOS):");
                        for (int s = 0; s < 4; s++) {
                            for (int d = 0; d < 7; d++) {
                                if (temperaturas[s][d] == max) {
                                    System.out.println("  " + dias[d] + " de la Semana " + (s + 1));
                                }
                            }
                        }
                    } else {
                        System.out.println("Primero rellena las temperaturas");
                    }
                    break;

                case 5:
                    System.out.println("Has salido del programa");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 5);
    }
}