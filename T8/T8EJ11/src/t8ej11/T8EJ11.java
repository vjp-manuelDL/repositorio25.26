package t8ej11;

import java.util.Scanner;

public class T8EJ11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Crear primer mueble usando CONSTRUCTOR POR DEFECTO
        Mueble mueble1 = new Mueble();
        // Configurar sus atributos mediante setters
        mueble1.setDescripcion("Silla de oficina");
        mueble1.setPrecio(89.99);

        // Crear segundo mueble usando CONSTRUCTOR PARAMETRIZADO
        Mueble mueble2 = new Mueble("Mesa de comedor", 249.50);

        // Mostrar información inicial
        System.out.println("=== MUEBLES CREADOS ===");
        System.out.println("Mueble 1 (constructor por defecto):");
        System.out.println(mueble1.toString());
        System.out.println("\nMueble 2 (constructor parametrizado):");
        System.out.println(mueble2.toString());

        // Modificar atributos mediante setters
        System.out.print("\nIntroduce nueva descripción para el mueble 1: ");
        String nuevaDesc = entrada.nextLine();
        mueble1.setDescripcion(nuevaDesc);

        System.out.print("Introduce nuevo precio para el mueble 2: ");
        double nuevoPrecio = Double.parseDouble(entrada.nextLine());
        mueble2.setPrecio(nuevoPrecio);

        // Mostrar información actualizada
        System.out.println("\n=== MUEBLES ACTUALIZADOS ===");
        System.out.println("Mueble 1: " + mueble1.toString());
        System.out.println("Mueble 2: " + mueble2.toString());

        // Operación adicional: calcular precio total
        double precioTotal = mueble1.getPrecio() + mueble2.getPrecio();
        System.out.println("\nPrecio total de ambos muebles: " + precioTotal + "€");

        entrada.close();
    }
}