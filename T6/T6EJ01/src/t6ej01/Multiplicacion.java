/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej01;

/**
 *
 * @author Admin
 */
public class Multiplicacion extends Calculadora {
    private int multiplicador; // esto es para guardar el número por el que se multiplica

    public Multiplicacion(int numero, int multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }

    // Esto es para calcular y mostrar la multiplicación
    public void realizarOperacion() {
        System.out.println(numero + " * " + multiplicador + " = " + (numero * multiplicador));
    }
}
