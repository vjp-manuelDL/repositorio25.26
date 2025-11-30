/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej03;

/**
 *
 * @author Admin
 */
public abstract class FiguraGeometrica {
    // Atributo común a todas las figuras
    protected String color;

    // Esto es para inicializar el color al crear una figura
    public FiguraGeometrica(String color) {
        this.color = color;
    }

    // Métodos abstractos: cada figura concreta los implementará
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    // Esto es para obtener el color de la figura
    public String getColor() {
        return color;
    }
}
