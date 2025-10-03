/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ej15.ob;

/**
 *
 * @author alumno
 */
public class T2EJ15OB {
    public final static int SEGUNDOS = 10000    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int horas = SEGUNDOS / 3600;
        int minutos = SEGUNDOS % 3600 / 60;
        int segundos2 = SEGUNDOS % 3600 % 60 ;
        System.out.println("10.000 segundos son: " + horas + "horas , " + minutos + " y " + segundos2 + " segundos");
        
        
        // TODO code application logic here
    }
    
}
