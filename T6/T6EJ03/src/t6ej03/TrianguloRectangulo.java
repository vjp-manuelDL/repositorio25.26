/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej03;

/**
 *
 * @author Admin
 */
public class TrianguloRectangulo extends Triangulo {

    public TrianguloRectangulo(String color, double base, double altura) {
        super(color, base, altura);
    }

    // Método para calcular la hipotenusa
    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    // Perímetro = base + altura + hipotenusa
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    // Tipo de triángulo rectángulo
    public String determinarTipo() {
        double h = calcularHipotenusa();
        if (base == altura || base == h || altura == h) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
        // No puede ser equilátero si es rectángulo
    }
}
