package tej14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEJ14 {

    public final static int FIL = 4;

    public final static int COL = 7;

    public final static int MIN = -1;

    public final static int MAX = 42;

    public static int generarRandom() {
        int random = (int) ((((MAX - MIN)) * Math.random()));
        return random;
    }

    public static void rellenarTemperaturas(int[][] array) {
        int i, j;
        for (i = 0; i < FIL; i++) {
            for (j = 0; j < COL; j++) {
                array[i][j] = generarRandom();
            }
        }
    }

    public static void mostrarTemperaturas(int[][] array) {
        int i, j;
        for (i = 0; i < FIL; i++) {
            for (j = 0; j < COL; j++) {
                System.out.print(" [" + i + "][" + j + "]-->" + array[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }

    public static void mostrarPromediotemperatura(int[][] array) {
        int i, j;
        int suma = 0;
        for (i = 0; i < FIL; i++) {
            for (j = 0; j < COL; j++) {
                suma = suma + array[i][j];
            }
        }
        suma = suma / 28;
        System.out.println("La media del mes es: " + suma);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] array = new int[FIL][COL];
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        rellenarTemperaturas(array);
        mostrarTemperaturas(array);
        mostrarPromediotemperatura(array);

    }

}
