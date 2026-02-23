package t10ej_02;

import java.util.Scanner;

public class T10EJ_02 {

    // 1. Leer valores hasta número negativo (sin break)
    public static int[] leerValores() {
        Scanner sc = new Scanner(System.in);
        int[] temp = new int[100];
        int count = 0;
        boolean continuar = true;
        
        System.out.println("Introduce números positivos (negativo para terminar):");
        while (continuar) {
            int n = sc.nextInt();
            if (n < 0) {
                continuar = false;
            } else {
                temp[count++] = n;
            }
        }
        
        int[] resultado = new int[count];
        for (int i = 0; i < count; i++) resultado[i] = temp[i];
        return resultado;
    }

    // 2. Mostrar elementos
    public static void mostrarLista(int[] lista) {
        System.out.print("Lista: [");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + (i < lista.length-1 ? ", " : ""));
        }
        System.out.println("]");
    }

    // 3. Obtener mayor
    public static int obtenerMayor(int[] lista) {
        int max = lista[0];
        for (int n : lista) if (n > max) max = n;
        return max;
    }

    // 4. Obtener menor
    public static int obtenerMenor(int[] lista) {
        int min = lista[0];
        for (int n : lista) if (n < min) min = n;
        return min;
    }

    // 5. Calcular suma
    public static int calcularSuma(int[] lista) {
        int suma = 0;
        for (int n : lista) suma += n;
        return suma;
    }

    public static void main(String[] args) {
        int[] numeros = leerValores();
        
        if (numeros.length == 0) {
            System.out.println("No hay datos válidos.");
            return;
        }
        
        mostrarLista(numeros);
        System.out.println("Mayor: " + obtenerMayor(numeros));
        System.out.println("Menor: " + obtenerMenor(numeros));
        System.out.println("Suma:  " + calcularSuma(numeros));
    }
}
