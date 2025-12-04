package t6ej03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Admin
 */
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    // Esto es para crear un rectángulo con color, base y altura
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // Esto es para calcular el área del rectángulo
    public double calcularArea() {
        return base * altura;
    }

    // Esto es para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
