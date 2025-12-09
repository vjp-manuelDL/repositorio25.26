/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_03;

/**
 *
 * @author Admin
 */
public abstract class Triangulo extends Figuras{
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public abstract void calcularHipotenusa();
    public abstract void calcularTipoTriangulo();

    
    
}
