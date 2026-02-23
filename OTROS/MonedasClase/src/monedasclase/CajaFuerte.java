package monedasclase;

import java.util.Scanner;  // el scanner para añadir toda la info
//clase caja fuerte

public class CajaFuerte {

    static Moneda[][] matriz = new Moneda[3][3]; // la matriz 3x3  se les pone static para que podamos poner al metodo static
    static Scanner entrada = new Scanner(System.in); // el scanner

    //rellenar todas las monedas
    public static void rellenarCaja() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { /*  asi se hacen los bucles para las matrices */ 
                System.out.print("El orden de los datos es:  Valor, Pais, Material: ");
                matriz[i][j] = new Moneda(entrada.nextFloat(), entrada.next(), entrada.next());
            }
        }
    }

    public static void mostrarPorMaterial() {
        System.out.print("El material que busca: ");
        String mat = entrada.next();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { /*  asi se hacen los bucles para las matrices */ 
                if (matriz[i][j].getMaterialMoneda().equals(mat))  //esta comprobando el material de las monedas a ver si coincide
                {
                    System.out.println("El pais de la moneda es: " + matriz[i][j].getPaisMoneda() + "\nY su valor es: " + matriz[i][j].getValorMoneda());
                }
            }
        }
    }

    public static void BuscarmasValiosa() {
        Moneda mayor = matriz[0][0]; //ponemos a la primera como más valiosa
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) /*  asi se hacen los bucles para las matrices */ 
            { 
                if ( matriz[i][j].getValorMoneda() > mayor.getValorMoneda()) {
                    mayor = matriz[i][j];
                }
            }
        }
        // damos toda la info de la moneda mas valiosa
            System.out.println("El pais de la moneda es:" + mayor.getPaisMoneda() + "\nEl valor de la moneda es: " + mayor.getValorMoneda()
            + "\nY el material es: " + mayor.getMaterialMoneda());
            
        }
    }

