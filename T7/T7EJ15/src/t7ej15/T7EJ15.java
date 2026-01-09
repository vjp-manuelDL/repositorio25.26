
package t7ej15;
import java.util.Scanner;

public class T7EJ15 {

    static final int MESES = 12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] ventas = new int[MESES];
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        boolean salir = false;
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    rellenarVentas(ventas);
                    System.out.println("✅ Ventas generadas aleatoriamente.");
                    break;
                case 2:
                    mostrarVentas(ventas, nombresMeses);
                    break;
                case 3:
                    mostrarVentasAlReves(ventas, nombresMeses);
                    break;
                case 4:
                    System.out.println("Suma total de ventas: " + sumaTotal(ventas));
                    break;
                case 5:
                    System.out.println("Ventas totales en meses pares: " + sumaMesesPares(ventas));
                    break;
                case 6:
                    String mesMasVentas = mesConMasVentas(ventas, nombresMeses);
                    System.out.println("Mes con más ventas: " + mesMasVentas);
                    break;
                case 7:
                    System.out.println("👋 ¡Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("❌ Opción no válida.");
            }
            System.out.println(); // Salto visual

        } while (!salir);
    }

    public static void mostrarMenu() {
        System.out.println("=== MENÚ DE VENTAS ===");
        System.out.println("1. Rellenar ventas (aleatorias)");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Mostrar ventas al revés");
        System.out.println("4. Suma total de ventas");
        System.out.println("5. Ventas de meses pares");
        System.out.println("6. Mes con más ventas");
        System.out.println("7. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void rellenarVentas(int[] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.random() * 91) + 10; // números del 10 al 100
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

    // Meses pares: Febrero (mes 2), Abril (4)... → índices 1, 3, 5, 7, 9, 11
    public static int sumaMesesPares(int[] ventas) {
        int suma = 0;
        for (int i = 1; i < ventas.length; i += 2) {
            suma += ventas[i];
        }
        return suma;
    }

    // ✅ Versión SIN idx: actualiza directamente el nombre del mes
    public static String mesConMasVentas(int[] ventas, String[] meses) {
        int max = ventas[0];
        String mesMayor = meses[0]; // empezamos con enero

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > max) {
                max = ventas[i];
                mesMayor = meses[i]; // actualizamos el nombre directamente
            }
        }
        return mesMayor;
    }
}