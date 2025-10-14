/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej07;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3EJ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int diasemana;
        
        System.out.println("Escribe el numero de un dia de la semana para ver"
                +" si es o no laborable"); 
        diasemana = entrada.nextInt();
        if (diasemana<1){System.out.println("No existe el dia");}
        
        switch (diasemana){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: 
            boolean laborable = true;
                System.out.println("El dia es laborable");
                break;

            case 6:
            case 7:
                laborable=false; 
                System.out.println("El dia no es laborable");
        }
        if (diasemana>7){System.out.println("No existe el dia");}
        // TODO code application logic here
    }
    
}
