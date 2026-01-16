package t7ej04;

public class T7EJ04 {

    public final static int FIL = 4;
    public final static int COL = 3;    // Se crean Statics para solo cambiar aqui si es necesario

    public static void rellenarNumeros(int[][] array) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < COL; j++) {
                array[i][j] = (int) (Math.random() * 101) + 100;
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < COL; j++) {
                    System.out.println("El valor para la posicion " + i + " " + j + " es: "
                            + array[i][j]);
                    System.out.println("\n");
               /* if (i == 0 && j < COL) {
                    System.out.println("El valor para la posicion " + i + " " + j + " es: "
                            + array[i][j]);
                    
                } else if (i == 1 && j < COL) {
                    
                    System.out.println("El valor para la posicion " + i + " " + j + " es: "
                            + array[i][j]);
                } else if (i == 2 && j < COL) {
                    
                    System.out.println("El valor para la posicion " + i + " " + j + " es: "
                            + array[i][j]);
                }
  NO ME SALE EL ORDENARLO BIEN*/
            }
        }
    }

    public static void mostrarPares(int[][] array) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < COL; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.println("El numero de la posicion: "
                            + i + " " + j + " es par, el numero es : " + array[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[][] = new int[FIL][COL]; // se ponen los valores del static
        rellenarNumeros(array);
        mostrarArray(array);
        mostrarPares(array);

    }

}
