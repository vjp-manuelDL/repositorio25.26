package dominio;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */

public class Calculadora {
    private double operando1;
    private double operando2;

    public Calculadora(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double sumar() {
        return operando1 + operando2;
    }

    public double restar() {
        return operando1 - operando2;
    }

    public double multiplicar() {
        return operando1 * operando2;
    }

    public double dividir() {
        if (operando2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return operando1 / operando2;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;

        System.out.print("Operando 1: ");
        double op1 = entrada.nextDouble();

        System.out.print("Operando 2: ");
        double op2 = entrada.nextDouble();

        Calculadora calc = new Calculadora(op1, op2);

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Cambiar operandos");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + calc.sumar());
                    break;
                case 2:
                    System.out.println("Resultado: " + calc.restar());
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.multiplicar());
                    break;
                case 4:
                    try {
                        System.out.println("Resultado: " + calc.dividir());
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Nuevo operando 1: ");
                    op1 = entrada.nextDouble();
                    System.out.print("Nuevo operando 2: ");
                    op2 = entrada.nextDouble();
                    calc = new Calculadora(op1, op2);
                    System.out.println("Operandos actualizados.");
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliste del programa");
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        } while (!salir);

    }
}