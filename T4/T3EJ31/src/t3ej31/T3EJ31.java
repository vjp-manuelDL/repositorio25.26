/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej31;

/**
 *
 * @author Admin
 */
public class T3EJ31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int total = 0;
        int intentos = 0;

        while (total < 3) {
            int aleatorio = (int) ((Math.random()) * 100 + 1);
            intentos++;

            if (aleatorio % 2 != 0) { //numero impar
                if (total == 0) {
                    num1 = aleatorio;

                } else if (total == 1) {
                    num2 = aleatorio;

                } else if (total == 2) {
                    num3 = aleatorio;

                }
                total++;

            }
        }
        System.out.println("El numero total de intentos fue: " + intentos);
        System.out.println("Los numeros son:" + num1 + "/" + num2 + "/" + num3);

    }
}
