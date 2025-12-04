package t6ej03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Admin
 */
public abstract class Triangulo extends FiguraGeometrica {
    // Atributos comunes a todos los triángulos
    protected double base;
    protected double altura;

    // Esto es para inicializar el triángulo con color, base y altura
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // Esto es para calcular el área (común a todos los triángulos)
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // El perímetro depende del tipo de triángulo → lo implementan las subclases
    public abstract double calcularPerimetro();
}
