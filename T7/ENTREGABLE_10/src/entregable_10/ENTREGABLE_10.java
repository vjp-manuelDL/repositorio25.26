package entregable_10;

public class ENTREGABLE_10 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        // Rellenar con números aleatorios entre 1 y 8
        for (int i = 0; i < 10; i++) {
            numeros[i] = 1 + (int)(Math.random() * 8);
        }

        // Mostrar array original
        System.out.print("Se han generado los siguientes numeros: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (i < 9) System.out.print(" ");
        }
        System.out.println();

        // Sustituir repetidos por 0
        for (int i = 0; i < 10; i++) {
            boolean repetido = false;
            for (int j = 0; j < 10; j++) {
                if (i != j && numeros[i] == numeros[j]) {
                    repetido = true;
                  
                }
            }
            if (repetido) {
                numeros[i] = 0;
            }
        }

        // Mostrar array modificado
        System.out.print("Sustituimos los elementos repetidos por un 0: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (i < 9) System.out.print(" ");
        }
        System.out.println();
    }
}