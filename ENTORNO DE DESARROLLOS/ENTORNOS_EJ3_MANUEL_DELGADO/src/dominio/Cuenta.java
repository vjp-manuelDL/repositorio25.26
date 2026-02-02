package dominio;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Cuenta {
    private String titular;
    private double cantidad;

    // Constructor con solo titular (cantidad = 0.0)
    public Cuenta(String titular) {
        this(titular, 0.0);
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad >= 0 ? cantidad : 0.0;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    // Setter
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Métodos especiales
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = Math.max(0, this.cantidad - cantidad);
        }
    }

    @Override
    public String toString() {
        return "Cuenta[titular=" + titular + ", cantidad=" + cantidad + " €]";
    }

    // Menú interactivo con bucle do-while (igual que tu Calculadora)
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;

        System.out.print("Titular de la cuenta: ");
        String titular = entrada.nextLine();

        Cuenta cuenta = new Cuenta(titular);

        do {
            System.out.println("\n--- MENÚ CUENTA ---");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Ver saldo");
            System.out.println("4. Ver datos completos");
            System.out.println("5. Cambiar titular");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cantidad a ingresar: ");
                    double ingreso = entrada.nextDouble();
                    cuenta.ingresar(ingreso);
                    System.out.println("Ingreso realizado. Saldo actual: " + cuenta.getCantidad() + " €");
                    break;
                case 2:
                    System.out.print("Cantidad a retirar: ");
                    double retiro = entrada.nextDouble();
                    double saldoAntes = cuenta.getCantidad();
                    cuenta.retirar(retiro);
                    if (cuenta.getCantidad() < saldoAntes) {
                        System.out.println("Retiro realizado. Saldo actual: " + cuenta.getCantidad() + " €");
                    } else {
                        System.out.println(" No se puede retirar esa cantidad (saldo insuficiente). Saldo actual: " + cuenta.getCantidad() + " €");
                    }
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuenta.getCantidad() + " €");
                    break;
                case 4:
                    System.out.println(cuenta.toString());
                    break;
                case 5:
                    entrada.nextLine(); // Limpiar buffer
                    System.out.print("Nuevo titular: ");
                    String nuevoTitular = entrada.nextLine();
                    cuenta.setTitular(nuevoTitular);
                    System.out.println("Titular actualizado a: " + cuenta.getTitular());
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliste del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!salir);

    }
}