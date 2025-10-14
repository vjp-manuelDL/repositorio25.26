/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ej19.ob;

/**
 *
 * @author alumno
 */
public class T2EJ19OB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=3,b=6,c;//Declaro valores de A y de B
        c= a/b; //Declaro el valor de C
        System.out.println("El valor de c es: " + c);
        
        c= a % b; //Hago el resto de la division 
        System.out.println("El valor de c es: " + c);
        
        ++a; //Pre incremento, A vale 1 más
        System.out.println("El valor de a es: " + a);
        
        c =  ++a + b++; //A pasa de 4 a 5 pre incremento y B de 6 a 7 post incremento (usa el 6 y luego pasa a valer 7)
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
        
        c = ++a + ++b; //Pre incremento, A y B se les suma 1 a ambos antes de la suma
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
        // TODO code application logic here
    }
    
}
