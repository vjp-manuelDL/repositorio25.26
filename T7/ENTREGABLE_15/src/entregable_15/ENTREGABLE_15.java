package entregable_15;

import java.util.Scanner;

public class ENTREGABLE_15 {

    static final int MESES = 12;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] ventas = new int[MESES];
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        boolean salir = false;
        int opcion;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            if (opcion == 1) {
                rellenarVentas(ventas);
                System.out.println("Ventas aleatorias.");
            }
            else if (opcion == 2) {
                mostrarVentas(ventas, nombresMeses);
            }
            else if (opcion == 3) {
                mostrarVentasAlReves(ventas, nombresMeses);
            }
            else if (opcion == 4) {
                System.out.println("Suma total de ventas: " + sumaTotal(ventas));
            }
            else if (opcion == 5) {
                System.out.println("Ventas totales en meses pares: " + sumaMesesPares(ventas));
            }
            else if (opcion == 6) {
                String mesMasVentas = mesConMasVentas(ventas, nombresMeses);
                System.out.println("Mes con mas ventas: " + mesMasVentas);
            }
            else if (opcion == 7) {
                System.out.println("Has salido del programa!");
                salir = true;
            }
            else {
                System.out.println(" Opcion no valida.");
            }

            System.out.println(); // Salto visual

        } while (!salir);

    }

    public static void mostrarMenu() {
        System.out.println("=== MENU DE VENTAS ===");
        System.out.println("1. Rellenar ventas (aleatorias)");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Mostrar ventas al reves");
        System.out.println("4. Suma total de ventas");
        System.out.println("5. Ventas de meses pares");
        System.out.println("6. Mes con mas ventas");
        System.out.println("7. Salir");
        System.out.print("Elige una opcion: ");
    }

    public static void rellenarVentas(int[] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.random() * 91) + 10;

        }
    }

    public static void mostrarVentas(int[] ventas, String[] meses) {
        System.out.println("VENTAS POR MES:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(meses[i] + ": " + ventas[i] + " coches");
        }
    }

    public static void mostrarVentasAlReves(int[] ventas, String[] meses) {
        System.out.println("VENTAS AL REVÉS (de Diciembre a Enero):");
        for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.println(meses[i] + ": " + ventas[i] + " coches");
        }
    }

    public static int sumaTotal(int[] ventas) {
        int suma = 0;
        for (int venta : ventas) {
            suma += venta;
        }
        return suma;
    }

    // Meses pares: Febrero (mes 2), Abril (4)...
    public static int sumaMesesPares(int[] ventas) {
        int suma = 0;
        for (int i = 1; i < ventas.length; i += 2) {
            suma += ventas[i];
        }
        return suma;
    }

    public static String mesConMasVentas(int[] ventas, String[] meses) {
        int max = ventas[0];
        String mesMayor = meses[0];

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > max) {
                max = ventas[i];
                mesMayor = meses[i];
            }
        }
        return mesMayor;
    }
}
