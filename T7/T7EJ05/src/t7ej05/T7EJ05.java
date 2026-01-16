package t7ej05;

import java.util.Scanner;

public class T7EJ05 {

    public final static int FIL = 4;
    public final static int COL = 2;

    public static void pedirNumeros(int[][] array) {
        int i, j;
        for (i = 0; i < FIL; i++) {
            for (j = 0; j < COL; j++) {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Escriba el numero para la posicion: " + i + " " + j);
                array[i][j] = entrada.nextInt();
            }

        }
    }

    public static void sumarNumeros(int[][] array) {
        int i, j;
        int suma = 0;
        for (i = 0; i < FIL; i++) {
            for (j = 0; j < COL; j++) {
                suma = suma + array[i][j];
               
            }

        }
         System.out.println("El total de la suma es: " + suma);
    }

    public static void main(String[] args) {
        int array[][] = new int[FIL][COL];
        pedirNumeros(array);
        sumarNumeros(array);
    }

}
