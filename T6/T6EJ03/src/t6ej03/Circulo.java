/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej03;

/**
 *
 * @author Admin
 */
public class Circulo extends FiguraGeometrica {
    private double radio;

    // Esto es para crear un círculo con color y radio
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // Esto es para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Esto es para calcular el perímetro (longitud de la circunferencia)
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
