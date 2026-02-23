    package t10_ej03;
import  java.util.Scanner;

public class T10_EJ03 {
    // Metodo para leer los numeros
    
    public static int[] leerNumeros() {
        Scanner entrada = new Scanner(System.in);
        int[] temp = new int[100];
        int count = 0;
        boolean seguir = true;

        while (seguir) {
            System.out.print("Introduce un numero: ");
            temp[count] = entrada.nextInt();
            count++;

            System.out.print("Quieres mas numeros (1=si, 0=no): ");
            int opcion = entrada.nextInt();
            if (opcion == 0) {
                seguir = false;
            }
        }

        // Crear array del tamaño exacto
        int[] lista = new int[count];
        for (int i = 0; i < count; i++) {
            lista[i] = temp[i];
        }
        return lista;
    }

    // Metodo para mostrar la lista
    public static void mostrarLista(int[] lista) {
        System.out.print("Lista: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("");
    }

    // Metodo para intercambiar 2a y 4a posicion
    public static void intercambiar(int[] lista) {
        if (lista.length >= 4) {
            int aux = lista[1];
            lista[1] = lista[3];
            lista[3] = aux;
        }
    }

    public static void main(String[] args) {
        // Leer datos
        int[] numeros = leerNumeros();

        // Comprobar si hay suficientes datos
        if (numeros.length < 4) {
            System.out.println("Necesitas al menos 4 numeros.");
        } else {
            // Mostrar original
            System.out.println("Lista original:");
            mostrarLista(numeros);

            // Intercambiar
            intercambiar(numeros);

            // Mostrar final
            System.out.println("Lista después de intercambiar:");
            mostrarLista(numeros);
        }
    }
}