package t4ej06;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Comprobar {
    static void comprobarNota(int nota){
        if (nota<5){System.out.println("Suspenso");}
        
        if (nota>= 5 && nota <=6){System.out.println("Bien");}
        
        if (nota>=7 && nota <=8){System.out.println("Notable");}
        
        if (nota>=9 && nota<=10 ){System.out.println("Sobresaliente");}
    }
    
}
