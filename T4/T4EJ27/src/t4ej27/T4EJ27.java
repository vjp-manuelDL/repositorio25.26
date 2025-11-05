/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej27;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4EJ27 {
//esto es para tener los valores fijos de cara o cruz
    
    public final static String RESPUESTA_1 = "cara";
    public final static String RESPUESTA_2 = "cruz";

    public static int lanZamiento() {
        int random = 0;
        random = (int) (Math.random() * 2); //se pone *2 para que sea 0 o 1
        return random;
    }
//esto es para pedir el lado , si cara o cruz

    public static String pedirLado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el lado");
        return entrada.nextLine();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean acertado = false;
        //hago el bucle mientras q falle para que siga
        while (!acertado) {
            String eleccion = pedirLado().toLowerCase();

            if (eleccion.equals(RESPUESTA_1) || (eleccion.equals(RESPUESTA_2))) {
                int num = lanZamiento();
                String resultado;

                if (num == 0) {
                    resultado = RESPUESTA_1;
                } else {
                    resultado = RESPUESTA_2;
                }
                System.out.println("La moneda salio: " + resultado);
                //aqui lo que hago el que corrobore valores y de si es fallo o acierto
                if (eleccion.equals(resultado)){
                    System.out.println("Enhorabuena has acertado");
                acertado = true;}
                else{System.out.println("Has perdido, intentalo de nuevo");}
                
                
            }
        }
    }

    // TODO code application logic here
}
