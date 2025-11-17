/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_1;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
Ejercicio 21 (Obligatorio): Pedir segundos y convertirlos a días, horas, minutos y segundos.
→ Practica operaciones, división entera y módulo.
        */
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Escribe el numero de segundos que quieres"
                + " convertir: ");
        int entrar = entrada.nextInt();
        
        int dias;
        int horas;
        int mins;
        int segs;
        
        dias = entrar / 86400;
        horas = entrar % 86400 / 3600;
        mins = entrar % 86400 % 3600 / 60;
        segs = entrar % 86400 % 3600 % 60 ;
        
        System.out.println(entrar + " segundos son: " + dias + " dias, "
        + horas + " horas, " + mins + " minutos, " + segs + " segundos.");
        
        
        
    }
    
}
