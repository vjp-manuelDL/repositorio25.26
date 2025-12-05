package repaso_8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {

    public static void probarNumer() {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Escribe el valor del numero: ");
        num = entrada.nextInt();

        Numero numero = new Numero(num);

        if (numero.getValor() % 2 == 0) {
            System.out.println("Es PAR");

        } else {
            System.out.println("Es IMPAR");
        }
    }

}
