package repaso_18;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    public static void probarTest() {
        double resultado;
        Scanner entrada = new Scanner(System.in);

        Numero num1 = new Numero();
        System.out.println("Escriba el primer numero");
        num1.setValor(entrada.nextDouble());

        Numero num2 = new Numero();
        System.out.println("Escriba el segundo numero");
        num2.setValor(entrada.nextDouble());

        try {
            int opcion;
            do {
                System.out.println("--MENU--");
                System.out.println("1.- Sumar los números.");
                System.out.println("2.- Restar los números.");
                System.out.println("3.- Multiplicar los números.");
                System.out.println("4.- Dividir los números");
                System.out.println("5.- Salir del programa.");
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        resultado = (num1.getValor() + num2.getValor());
                        System.out.println("El resultado es: " + resultado);
                        break;
                    case 2:
                        resultado = (num1.getValor() - num2.getValor());
                        System.out.println("El resultado es: " + resultado);
                        break;
                    case 3:
                        resultado = (num1.getValor() * num2.getValor());
                        System.out.println("El resultado es: " + resultado);
                        break;
                    case 4:
                        if (num2.getValor() == 0) {
                            System.err.println("ERROR ES INFINITO");
                        } else {
                            resultado = (num1.getValor() / num2.getValor());
                            System.out.println("El resultado es: " + resultado);
                        }   break;
                    default:
                        System.err.println("OPCION NO VALIDA");
                        break;
                        
                }

            } while (opcion != 5);
            System.out.println("HAS SALIDO DEL MENU");

        } catch (Exception e) {
            System.err.println("ERROR, SOLO SE PUEDEN NUMEROS");
            entrada.nextLine();
        }

    }

}
