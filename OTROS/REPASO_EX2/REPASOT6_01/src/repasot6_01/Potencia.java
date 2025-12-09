/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_01;

/**
 *
 * @author Admin
 */
public class Potencia extends Calculadora{
    private double potencia;

    public Potencia() {
        potencia = 0;
    }

    public Potencia(double numero, double potencia) {
        super(numero);
        this.potencia = potencia;

    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public void realizarOperacion() {
        double resultado = Math.pow(getNumero(), this.potencia);
        System.out.println("La potencia de: " + this.getNumero() + " elevado a " + this.potencia + " es: " + resultado);

    }

}

    

