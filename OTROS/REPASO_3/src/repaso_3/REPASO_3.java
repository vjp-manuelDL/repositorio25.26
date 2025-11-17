/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_3;
import java.util.Scanner;
        /**
         *
         * @author Admin
         */

public class REPASO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        "Realiza un programa que dado un importe en euros nos indique el número
        óptimo de billetes de 50, 20, 10 y 5, 
        así como la cantidad sobrante en monedas de 2 y de 1 euro." 
         */
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe la cantidad de Dinero para hacer el cambio:");
        int dinero = entrada.nextInt();

        int bil50;
        int bil20;
        int bil10;
        int bil5;
        int m2;
        int m1;

        bil50 = dinero / 50;
        bil20 = dinero % 50 / 20;
        bil10 = dinero % 50 % 20 / 10;
        bil5 = dinero % 50 % 20 % 10 / 5;
        m2 = bil5 = dinero % 50 % 20 % 10 % 5 / 2;
        m1 = bil5 = dinero % 50 % 20 % 10 % 5 % 2 ;

        System.out.println("El cambio de " + dinero + " es:");
        System.out.println("Billetes de 50: " + bil50);
        System.out.println("Billetes de 20: " + bil20);
        System.out.println("Billetes de 10: " + bil10);
        System.out.println("Billetes de 5: " + bil5);
        System.out.println("Monedas  de 2: " + m2);
        System.out.println("Monedas de 1: " + m1);

    }

}
