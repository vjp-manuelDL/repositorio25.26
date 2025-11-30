/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej01;

/**
 *
 * @author Admin
 */
public abstract class Calculadora {

    protected int numero;

    public Calculadora(int numero) {
        this.numero = numero;
    }

    // Método abstracto: sin llaves {}, solo firma
    public abstract void realizarOperacion();

}
