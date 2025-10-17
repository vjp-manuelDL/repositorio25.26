/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej25;

/**
 *
 * @author alumno
 */
public class T3EJ25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 17;
        int suma = 0;
        do{
            if (num1 % 2 ==0)
                suma = suma + num1;
                num1++;
        } while (num1 <= 139);
        
        System.out.println("El total es: " + suma);
        // TODO code application logic here
    }
    
}
