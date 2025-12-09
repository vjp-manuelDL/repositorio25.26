/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_03;

/**
 *
 * @author Admin
 */
public class Test {

    public static void probarTest() {
        Figuras cir = new Circulo(30, "azul");
        cir.calcularArea();
        cir.calcularPerimetro();
        Figuras cua = new Cuadrado(50, "verde");
        cua.calcularArea();
        cua.calcularPerimetro();
        Figuras rec = new Rectangulo(100, 50, "amarillo");
        rec.calcularArea();
        rec.calcularPerimetro();
        
        Figuras tri = new TriRectangulo(100, 300, "rojo");
        tri.calcularArea();
        tri.calcularPerimetro();
        ((Triangulo)tri).calcularHipotenusa();
        ((Triangulo)tri).calcularTipoTriangulo();
        
      
        
    }
}
