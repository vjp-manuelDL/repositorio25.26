/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_03;

/**
 *
 * @author Admin
 */
public class Rectangulo extends Figuras{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura, String color) {
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
    
     @Override
    public  void calcularArea(){
        double area = base * altura;
        System.out.println("El area del rectangulo " + getColor() + " es: " + area + " Centimetros");
    }
    
    
    @Override
    public  void calcularPerimetro(){
        double perimetro = 2 * ( altura + base);
        System.out.println("El perimetro del rectangulo " + getColor() + " es: " + perimetro + " Centimetros");
    }
    
}
