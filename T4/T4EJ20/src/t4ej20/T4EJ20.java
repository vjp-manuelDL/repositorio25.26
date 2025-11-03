/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ20 {
//Creo los 2 valores estaticos

    public final static String RESPUESTA_1 = "Madrid";
    public final static String RESPUESTA_2 = "Colon";
//creo el primer boolean para comprobar la respuesta 1

    public static boolean pregunTA1() {
        Scanner entrada = new Scanner(System.in);
        boolean respuesta1 = false;
        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?");
        String respuesta = entrada.nextLine();
        if (!respuesta.equals(RESPUESTA_1)) {
            System.out.println("Respuesta incorrecta!!, Era Madrid");
        } else {
            System.out.println("Enhorabuena has acertado!!");
            respuesta1 = true;
        }
        return respuesta1;

    }
//creo el segundo boolean para comprobar la respuesta 2

    public static boolean pregunTA2() {
        Scanner entrada = new Scanner(System.in);
        boolean respuesta2 = false;
        System.out.println("2ª PREGUNTA: ¿Quién descubrió América?");
        String respuesta = entrada.nextLine();
        if (!respuesta.equals(RESPUESTA_2)) {
            System.out.println("Respuesta incorrecta!!, Era Colon");
        } else {
            System.out.println("Enhorabuena has acertado!!");
            respuesta2 = true;
        }
        return respuesta2;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean num1 = false;
        boolean num2 = false;
        int aciertos = 0;
        int total = 0;
        System.out.println("EXAMEN DE CULTURA GENERAL");
        num1 = T4EJ20.pregunTA1();
        if (num1) {
            total += 5;
            aciertos++;
        }
        /* Despues de haber creado las variables hago la comprobación 
        para que si las respuestas sean correctas sume tanto nota como el acierto
        
         */
        num2 = T4EJ20.pregunTA2();
        if (num2) {
            total += 5;
            aciertos++;
        }

        System.out.println("El numero total de aciertos fue: " + aciertos);

        System.out.println("Tu nota es: " + total);
    }

    // TODO code application logic here
}
