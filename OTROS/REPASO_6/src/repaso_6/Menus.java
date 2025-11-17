/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menus {

    public static void mostrarMenu() {
        System.out.println("---MENU---");
        System.out.println("1-SUMAR");
        System.out.println("2-RESTAR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");
        System.out.println("5-SALIR");

    }

    public static int sumarNum(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public static int restatNum(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public static int multiNum(int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }

    public static int divNum(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("DIVISION ENTRE CERO");
        }
        return num1 / num2;
    }
}
