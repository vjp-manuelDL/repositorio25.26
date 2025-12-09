/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_03;

/**
 *
 * @author Admin
 */
public class TriRectangulo extends Triangulo {

    private double hipotenusa;

    public TriRectangulo(double base, double altura) {
        super(base, altura);
        this.hipotenusa = Math.sqrt(base * base + altura * altura);
    }

    public TriRectangulo(double base, double altura, String color) {
        super(base, altura, color);
        this.hipotenusa = Math.sqrt(base * base + altura * altura);
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo " + getColor() + " es: " + area + " cm²");
    }

    @Override
    public void calcularHipotenusa() {
        System.out.println("La hipotenusa del triangulo " + getColor() + " es: " + hipotenusa + " cm");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = base + altura + hipotenusa;
        System.out.println("El perimetro del triangulo " + getColor() + " es: " + perimetro + " cm");
    }

    @Override
    public void calcularTipoTriangulo() {
        // Redondeamos para evitar errores por coma flotante
        double a = Math.round(base * 1000) / 1000.0;
        double b = Math.round(altura * 1000) / 1000.0;
        double c = Math.round(hipotenusa * 1000) / 1000.0;

        if (a == b || b == c || a == c) {
            System.out.println("El triangulo es Isosceles.");
        } else {
            System.out.println("El triangulo es Escaleno.");
        }
    }

}
