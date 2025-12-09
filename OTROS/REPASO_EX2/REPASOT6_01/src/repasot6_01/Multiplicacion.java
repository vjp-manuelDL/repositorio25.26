/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_01;

/**
 *
 * @author Admin
 */
public class Multiplicacion extends Calculadora{
    private double multiplicador;

    public Multiplicacion() {
        multiplicador = 0;
    }

    public Multiplicacion(double numero, double multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;

    }

    public double getMulti() {
        return multiplicador;
    }

    public void setMulti(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public void realizarOperacion() {
        double resultado = this.getNumero() * this.multiplicador;
        System.out.println("La multiplicacion de: " + this.getNumero() + " y " + this.multiplicador + " es: " + resultado);

    }

}
