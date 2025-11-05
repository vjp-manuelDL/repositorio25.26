/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej19;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class T4EJ19 {

    public static void mostrarDias(String dia) {
        if (dia.equals("Lunes")) {
            System.out.println("El lunes es el primer dia de la semana");
        }
        else if (dia.equals("Martes")) {
            System.out.println("El martes es el segundo dia de la semana");
        }
        else if (dia.equals("Miercoles")) {
            System.out.println("El miercoles es el tercer dia de la semana");
        }
        else if (dia.equals("Jueves")) {
            System.out.println("El jueves es el cuarto dia de la semana");
        }
        else if (dia.equals("Viernes")) {
            System.out.println("El viernes es el quinto dia de la semana");
        }
        else if (dia.equals("Sabado")) {
            System.out.println("El sabado es el sexto dia de la semana");
        }
        else if (dia.equals("Domingo")) {
            System.out.println("El domingo es el septimo dia de la semana");
        }
        else {
            System.err.println("ERROR , dia no valido");}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el dia de la semana que quieres comprobar");
        String dia = entrada.nextLine();
        mostrarDias(dia);
        // TODO code application logic here
    }

}
