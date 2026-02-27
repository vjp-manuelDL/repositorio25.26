package t10_ej09;

import java.util.Scanner;

public class T10_EJ09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dia[] mes = new Dia[31];
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        boolean rellenado = false;
        int opcion;

        do {
            System.out.println("\n1. Rellenar temperaturas aleatorias");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Temperatura media del mes");
            System.out.println("4. Día/s más caluroso/s");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int diaSemanaInicio = (int) (Math.random() * 7);
                    for (int i = 0; i < 31; i++) {
                        int diaSemana = (diaSemanaInicio + i) % 7;
                        int temp = (int) (Math.random() * 41); // 0 a 40 grados
                        mes[i] = new Dia(diasSemana[diaSemana], i + 1, temp);
                    }
                    rellenado = true;
                    System.out.println("Temperaturas generadas.");
                    break;

                case 2:
                    if (rellenado) {
                        for (Dia d : mes) {
                            System.out.println(d.nombreDia + " día " + d.numeroDia + ": " + d.temperatura + " grados");
                        }
                    } else {
                        System.out.println("Primero rellene las temperaturas");
                    }
                    break;

                case 3:
                    if (rellenado) {
                        int suma = 0;
                        for (Dia d : mes) {
                            suma += d.temperatura;
                        }
                        System.out.println("Media del mes: " + (suma / 31.0) + "°C");
                    } else {
                        System.out.println("Primero rellene las temperaturas");
                    }
                    break;

                case 4:
                    if (rellenado) {
                        int max = mes[0].temperatura;
                        for (Dia d : mes) {
                            if (d.temperatura > max) max = d.temperatura;
                        }
                        System.out.println("Dia/s mas caluroso/s (" + max + "°C):");
                        for (Dia d : mes) {
                            if (d.temperatura == max) {
                                System.out.println("  El " + d.nombreDia + " dia " + d.numeroDia + " con " + d.temperatura + " grados.");
                            }
                        }
                    } else {
                        System.out.println("Primero rellene las temperatuas");
                    }
                    break;

                case 5:
                    System.out.println("Adiós");
                    break;

                default:
                    System.out.println("Opcion no valida, elija de las que estan en el menu");
            }
        } while (opcion != 5);
    }
}