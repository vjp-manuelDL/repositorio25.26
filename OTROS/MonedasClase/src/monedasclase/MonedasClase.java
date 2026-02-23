package monedasclase;

import java.util.Scanner;

public class MonedasClase {

    public static void menuOpciones() {
        System.out.println("---MENU DE OPCIONES---");
        System.out.println("1-RELLENAR LA CAJA FUERTE DE MONEDAS");
        System.out.println("2-MOSTAR LAS MONEDAS DE UN MATERIAL DETERMINADO");
        System.out.println("3-MOSTRAR LA MONEDA MAS VALIOSA");
        System.out.println("4-SALIR DEL PROGRAMA");

    }

    public static void elegirOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        // Bucle do-while para mostrar el menú hasta que el usuario elija salir
        do {
            menuOpciones();
            System.out.println("SELECCIONE UNA OPCION");
            opcion = entrada.nextInt();

            // Esto es para controlar el menu y la eleccion que hagan
            if (opcion == 1) {
                CajaFuerte.rellenarCaja();
            } else if (opcion == 2) {
                CajaFuerte.mostrarPorMaterial();
            } else if (opcion == 3) {
                CajaFuerte.BuscarmasValiosa();
            } else if (opcion == 4) {
            } else {
                System.out.println("Opción no valida. Intentelo de nuevo.");
            }

        } while (opcion != 4); // Si damos al 4 saldremos del programa
        System.out.println("HAS SALIDO DEL PROGRAMA");

        entrada.close();
    }

    public static void main(String[] args) {
        elegirOpcion();
    }

}
