/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej16;

/**
 *
 * @author Admin
 */
public class T3EJ16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 20;
        int total = 0;
//introduzco el numero con el que empezamos segun el enunciado
        
        while (numero <= 160){/*Aqui creo el bucle que llega hasta el 100
            y abajo pongo la condicion para saber si es impar,  y luego sumo un 1 
            para ir corroborando los impares , tambien sumo 1 al total de numeros
            impares que hay
            */
            if (numero % 2 != 0){
                System.out.print(numero + "/");}
            numero++;
            total++;
            }
        System.out.println();
        System.out.println("El numero total de numeros impares es: " + total);
        // TODO code application logic here
    }
    
}
