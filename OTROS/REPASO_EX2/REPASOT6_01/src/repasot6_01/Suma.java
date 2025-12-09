/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_01;

/**
 *
 * @author Admin
 */
public class Suma extends Calculadora {

    private double sumando;

    public Suma() {
        sumando = 0;
    }

    public Suma(double numero, double sumando) {
        super(numero);
        this.sumando = sumando;

    }

    public double getSumando() {
        return sumando;
    }

    public void setSumando(double sumando) {
        this.sumando = sumando;
    }

    @Override
    public void realizarOperacion() {
        double resultado = this.getNumero() + this.sumando;
        System.out.println("La suma de: " + this.getNumero() + " y " + this.sumando + " es: " + resultado);

    }

}
