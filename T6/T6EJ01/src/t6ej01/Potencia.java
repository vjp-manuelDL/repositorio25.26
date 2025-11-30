/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej01;

/**
 *
 * @author Admin
 */
public class Potencia extends Calculadora {
    private int exponente; // esto es para guardar el exponente

    public Potencia(int numero, int exponente) {
        super(numero);
        this.exponente = exponente;
    }

    // Esto es para calcular y mostrar la potencia
    public void realizarOperacion() {
        int resultado = (int) Math.pow(numero, exponente);
        System.out.println(numero + " ^ " + exponente + " = " + resultado);
    }
}
