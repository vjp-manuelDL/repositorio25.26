/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej03;

/**
 *
 * @author Admin
 */
public class Test {

    public static void pruebaDirecta() {
        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Cuadrado cu = new Cuadrado("Verde", 3);
        TrianguloRectangulo t = new TrianguloRectangulo("Amarillo", 3, 4);
        
        //Imprimo por pantalla los resultados
        System.out.println("=== PRUEBA DIRECTA ===");
        System.out.println("Circulo: Area = " + c.calcularArea() + ", Perimetro = " + c.calcularPerimetro());
        System.out.println("Rectangulo: Area = " + r.calcularArea() + ", Perimetro = " + r.calcularPerimetro());
        System.out.println("Cuadrado: Area = " + cu.calcularArea() + ", Perimetro = " + cu.calcularPerimetro());
        System.out.println("Triangulo: Area = " + t.calcularArea() + ", Perimetro = " + t.calcularPerimetro());
        System.out.println("Hipotenusa = " + t.calcularHipotenusa());
        System.out.println("Tipo = " + t.determinarTipo());
    }

    // Esto es para probar con polimorfismo (variables de tipo FiguraGeometrica)
    public static void pruebaPolimorfismo() {
        FiguraGeometrica[] figuras = {
            new Circulo("Rojo", 5),
            new Rectangulo("Azul", 4, 6),
            new Cuadrado("Verde", 3),
            new TrianguloRectangulo("Amarillo", 3, 4)
        };

        System.out.println("\n=== PRUEBA CON POLIMORFISMO ===");
        for (FiguraGeometrica f : figuras) {
            System.out.println("Color: " + f.getColor() + ": su  area: " + f.calcularArea() + ", perimetro: " + f.calcularPerimetro());
        }
    }
}
