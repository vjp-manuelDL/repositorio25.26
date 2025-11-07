/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colacarniceria;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ColaCarniceria {

    // CONSTANTES
    private static final char LETRA_INICIAL = 'A';
    private static final char LETRA_FINAL = 'C';

    // VARIABLES GLOBALES
    private static int numeroCompra = 1;
    private static int numeroPedido = 1;

    //Mostrar el menu de interaccion
    static void mostrarMenu() {
        System.out.println("---MENU---");
        System.out.println("Elija una de las siguiente opciones");
        System.out.println("1. Comprar.");
        System.out.println("2. Recoger pedido.");
        System.out.println("3. Salir.");
    }
    /*Genero la letra  restando el final al inicial y sumandole 1 para que sean 
    las letras A B y C (intente con codigo ASCII pero me daban problemas asique 
    he optado por esto
    */
    
    public static char generarLetraAleatoria() {
        int rango = LETRA_FINAL - LETRA_INICIAL +1;
        int aleatorio = (int) (Math.random() * rango);
        return (char) (LETRA_INICIAL + aleatorio);
    }
    //Esto es para recoger el numero introducido para la opcion deseada
    public static int pedirOpcion() {
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextInt();
        return opcion;
    }
    //Esto es para incrementar los tickets de compra
    public static int incrementarNumeroCompra() {
        numeroCompra++;
        return numeroCompra;
    }
    //Esto es para incrementar los tickets de pedido
    public static int incrementarNumeroPedido() {
        numeroPedido++;
        return numeroPedido;
    }
    //Los generadores de ticket de compra y pedido
    public static void generarNumeroEsperaCompra() {
        System.out.println("Numero C-"
                + generarLetraAleatoria() + "-" + numeroCompra);
    }

    public static void generarNumeroEsperaPedido() {
        System.out.println("Numero P-:"
                + generarLetraAleatoria() + "-" + numeroPedido);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numC = incrementarNumeroCompra();
        int numP = incrementarNumeroPedido();
        int opcion = 0;
        /*Aqui empieza el bucle
        al he optado por un do while, y de condidcion que opcion sea diferente de 3, si 
        opcion es igual a 3 se detiene el programa
        */
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            //y aqui para depende de si es compra o pedido realice el ticket 
            if (opcion == 1) {
                generarNumeroEsperaCompra();
                incrementarNumeroCompra();
            } else if (opcion == 2) {
                generarNumeroEsperaPedido();
                incrementarNumeroPedido();

            }
        } while (opcion != 3);
            System.err.println("HAS CERRADO EL MENU");
        

        // TODO code application logic here
    }

}
