
/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej11;

    import java.util.Scanner;

/**
 *
 * @author alumno
 */

public class T4EJ11 {

        public static int pedirNumero() {
            Scanner entrada = new Scanner(System.in);
            int dato;
            do {
                System.out.println("Escriba el numero al que quiere hacer la "
                        + "raiz");
                dato = entrada.nextInt();
                if (dato < 0){System.err.println("Error!El numero ha de ser positivo");}
            }while (dato < 0);
            return dato;
    }

        public static double realizarOp(){
            int numero;
            numero = T4EJ11.pedirNumero();
            double resul;
            resul = Math.sqrt(numero);
            return resul;
    }

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            double fin = T4EJ11.realizarOp();
            System.out.println("La raiz del numero es: " + fin);
            
            
        }
        
        
        }
