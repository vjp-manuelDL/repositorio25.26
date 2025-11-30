/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej01;

/**
 *
 * @author Admin
 */
public class Suma extends Calculadora {
    private int sumando; // esto es para guardar el valor que se suma

    // Constructor: esto es para crear un objeto Suma con número base y sumando
    public Suma(int numero, int sumando) {
        super(numero); // esto llama al constructor de la clase padre
        this.sumando = sumando;
    }

    // Esto es para calcular y mostrar la suma
    public void realizarOperacion() {
        System.out.println(numero + " + " + sumando + " = " + (numero + sumando));
    }
}
