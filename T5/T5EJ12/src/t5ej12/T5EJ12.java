/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej12;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class T5EJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int c1 = pedirCateto(1);
        int c2 = pedirCateto(2);

        Triangulo triangulo = new Triangulo(c1,c2);

        System.out.println("La longitud de la hipotenusa es " + calcularHipotenusa(triangulo));
    }

    public static int pedirCateto(int catetoNum) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce el tamaño del cateto numero " + catetoNum);

        return scanner.nextInt();
    }

    public static double calcularHipotenusa(Triangulo triangulo) {
        return Math.sqrt(Math.pow(triangulo.getCateto1(),2) + Math.pow(triangulo.getCateto2(),2));
        
    }
    
}
