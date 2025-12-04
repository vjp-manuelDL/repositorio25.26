package repaso_9;

import java.util.Scanner;

public class REPASO_9 {

    public static void main(String[] args) {
        /*
         * Ejercicio de repaso 2 – Validador de DNI (Tema 02 + 03)
         * 
         * Crea un programa que:
         * 1. Pida al usuario un número de DNI (entero de 8 cifras).
         * 2. Valide que esté entre 10000000 y 99999999 (inclusive).
         * 3. Calcule la letra del DNI usando:
         *      resto = numero % 23
         *    y la tabla:
         *      0=T, 1=R, 2=W, 3=A, 4=G, 5=M, 6=Y, 7=F, 8=P, 9=D, 10=X,
         *      11=B, 12=N, 13=J, 14=Z, 15=S, 16=Q, 17=V, 18=H, 19=L,
         *      20=C, 21=K, 22=E
         * 4. Muestra el DNI completo: 12345678Z
         * 5. Si el número no tiene 8 cifras, muestra un error y vuelve a pedirlo (bucle).
         */

        Scanner entrada = new Scanner(System.in);
        int dni;

        do {
            System.out.print("Escriba el número del DNI (8 cifras): ");
            dni = entrada.nextInt();

            if (dni < 10000000 || dni > 99999999) {
                System.out.println("ERROR: El DNI debe tener exactamente 8 cifras.");
            }
        } while (dni < 10000000 || dni > 99999999);

        char letra = calcularLetra(dni);
        System.out.println("El DNI completo es: " + dni + letra);
    }

    // Método para calcular la letra del DNI
    public static char calcularLetra(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        return letras.charAt(resto);
    }
}
