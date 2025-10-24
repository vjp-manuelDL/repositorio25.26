package t4ej08;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alumno
 */
public class Entropy {

    static void eljass(int dinero, int b50, int b20, int b10, int m2, int m1) {
        b50 = dinero / 50;
        b20 = dinero % 50 / 20;
        b10 = dinero % 50 % 20 / 10;
        m2 = dinero % 50 % 20 % 10 / 2;
        m1 = dinero % 50 % 20 % 10 % 2;

        if (b50 > 0) {
            System.out.println("Necesitarás :" + b50 + " billetes de 50 euros");
        }
        if (b20 > 0) {
            System.out.println("Necesitarás :" + b20 + " billetes de 20 euros");
        }
        if (b10 > 0) {
            System.out.println("Necesitarás :" + b10 + " billetes de 10 euros");
        }
        if (m2 > 0) {
            System.out.println("Necesitarás :" + m2 + " monedas de 2 euros");
        }
        if (m1 > 0) {
            System.out.println("Necesitarás :" + m1 + " monedas de 1 euros");
        }

    }
}


