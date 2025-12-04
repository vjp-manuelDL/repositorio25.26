/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
"Crea un programa en JAVA en donde el usuario introduzca la nota de un alumno (número entero entre 0 y 10) y se 
escribirá su calificación según el valor de la nota ingresada: 

0 a 4 → Suspenso
5 a 6 → Bien
7 a 8 → Notable
9 a 10 → Sobresaliente
        
Nota: Se le avisará al usuario de un error en caso de que la nota no esté entre 0 y 10."
         */
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int nota;

        System.out.println("Escribe la nota:");
        nota = entrada.nextInt();

        if (nota < 0 || nota > 10) {
            System.err.println("ERROR, NOTA INVALIDA!!");
        }

        else if (nota < 5) {
            System.out.println("SUSPENSO");
        }
        else if (nota <= 6) {
            System.out.println("BIEN");
        }
        else if (nota <= 8) {
            System.out.println("NOTABLE");
        }
        else  {
            System.out.println("SOBRESALIENTE");
        }
    }
}
