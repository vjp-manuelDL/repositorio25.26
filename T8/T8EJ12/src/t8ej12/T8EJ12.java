package t8ej12;

import java.util.Scanner;

public class T8EJ12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Mueble[] muebles = new Mueble[4]; // Vector para 4 muebles
        int opcion;

        // Bucle do-while para el menú principal
        do {
            mostrarMenu();
            opcion = leerEntero(entrada, "Seleccione una opción: ");

            if (opcion == 1) {
                rellenarMuebles(entrada, muebles);
            } else if (opcion == 2) {
                mostrarMuebles(muebles);
            } else if (opcion == 3) {
                mostrarMueblesPorPrecio(entrada, muebles);
            } else if (opcion == 4) {
                System.out.println("¡Hasta pronto!");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

            // Pausa después de ejecutar una opción válida
            if (opcion >= 1 && opcion <= 3) {
                System.out.println("\nPresione Enter para continuar...");
                entrada.nextLine(); // Limpiar buffer
                entrada.nextLine(); // Esperar Enter
            }

        } while (opcion != 4);

        entrada.close();
    }

    // Muestra el menú de opciones
    private static void mostrarMenu() {
        System.out.println("\n=== GESTIÓN DE MUEBLES ===");
        System.out.println("1. Rellenar muebles");
        System.out.println("2. Mostrar todos los muebles");
        System.out.println("3. Mostrar muebles por precio máximo");
        System.out.println("4. Salir");
    }

    // Rellena todas las posiciones del vector con muebles
    private static void rellenarMuebles(Scanner entrada, Mueble[] muebles) {
        System.out.println("\n--- RELLENANDO MUEBLES (4 en total) ---");
        for (int i = 0; i < muebles.length; i++) {
            System.out.println("\nMueble " + (i + 1) + ":");
            System.out.print("Descripción: ");
            String descripcion = entrada.nextLine();
            double precio = leerDouble(entrada, "Precio: ");
            muebles[i] = new Mueble(descripcion, precio); // Crea objeto en posición i
        }
        System.out.println("\n¡Todos los muebles han sido registrados!");
    }

    // Muestra todos los muebles del vector
    private static void mostrarMuebles(Mueble[] muebles) {
        // Verificar si hay muebles registrados
        boolean hayMuebles = false;
        for (int i = 0; i < muebles.length; i++) {
            if (muebles[i] != null) {
                hayMuebles = true;
                break;
            }
        }

        if (!hayMuebles) {
            System.out.println("\nNo hay muebles registrados. Use la opción 1 para rellenarlos.");
            return;
        }

        System.out.println("\n=== LISTADO DE MUEBLES ===");
        for (int i = 0; i < muebles.length; i++) {
            if (muebles[i] != null) {
                System.out.println("Mueble " + (i + 1) + ": " + muebles[i].toString());
            } else {
                System.out.println("Mueble " + (i + 1) + ": [vacío]");
            }
        }
    }

    // Muestra muebles con precio <= al indicado por el usuario
    private static void mostrarMueblesPorPrecio(Scanner entrada, Mueble[] muebles) {
        // Verificar si hay muebles registrados
        boolean hayMuebles = false;
        for (int i = 0; i < muebles.length; i++) {
            if (muebles[i] != null) {
                hayMuebles = true;
                break;
            }
        }

        if (!hayMuebles) {
            System.out.println("\nNo hay muebles registrados. Use la opción 1 para rellenarlos.");
            return;
        }

        double precioMax = leerDouble(entrada, "Introduce precio máximo: ");
        boolean encontrado = false;

        System.out.println("\nMuebles con precio <= " + precioMax + "€:");
        for (int i = 0; i < muebles.length; i++) {
            if (muebles[i] != null && muebles[i].getPrecio() <= precioMax) {
                System.out.println("  - " + muebles[i].toString());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("  No se encontraron muebles con ese precio máximo.");
        }
    }

    // Método auxiliar: leer entero con validación
    private static int leerEntero(Scanner entrada, String mensaje) {
        int valor = 0;
        boolean valido = false;
        do {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(entrada.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe introducir un número entero válido.");
            }
        } while (!valido);
        return valor;
    }

    // Método auxiliar: leer double con validación
    private static double leerDouble(Scanner entrada, String mensaje) {
        double valor = 0.0;
        boolean valido = false;
        do {
            try {
                System.out.print(mensaje);
                valor = Double.parseDouble(entrada.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe introducir un número válido.");
            }
        } while (!valido);
        return valor;
    }
}