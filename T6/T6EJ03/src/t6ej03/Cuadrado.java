package t6ej03;

Circulo/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej03;

/**
 *
 * @author Admin
 */
public class Cuadrado extends FiguraGeometrica {
    private double lado;

    // Esto es para crear un cuadrado con color y longitud del lado
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    // Esto es para calcular el área del cuadrado
    public double calcularArea() {
        return lado * lado;
    }

    // Esto es para calcular el perímetro del cuadrado
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
