/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_12;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_12 {

    final static String pregunta1 = "Madrid";
    final static String pregunta2 = "Colon";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aciertos = 0;

        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?:");
        String respuesta1 = entrada.nextLine();
        if (pregunta1.equalsIgnoreCase(respuesta1)) {
            System.out.println("ENHORABUENA HAS ACERTADO!!");
            aciertos++;
        } else {
            System.out.println("ERROR, ERA MADRID");
        }
        System.out.println("2ª PREGUNTA: ¿Quién descubrió América?:");
        String respuesta2 = entrada.nextLine();
        if (pregunta2.equalsIgnoreCase(respuesta2)) {
            System.out.println("ENHORABUENA HAS ACERTADO!!");
            aciertos++;
        } else {
            System.out.println("ERROR, ERA COLON");}
        
        int nota;
        nota = aciertos * 5;
        System.out.println("La nota es: " + nota);
        

    }

}
