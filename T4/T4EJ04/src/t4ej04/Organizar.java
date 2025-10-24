package t4ej04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alumno
 */
public class Organizar {

    static void numeroMenor(float num1, float num2, float num3) {
        if (num1 < num2 && num1 < num3) {
            System.out.println("El numero menor es: " + num1);
        }
        if (num2 < num1 && num2 < num3) {
            System.out.println("El numero menor es: " + num2);
        }
        if (num3 < num2 && num1 > num3) {
            System.out.println("El numero menor es: " + num3);
        }
    }

}
