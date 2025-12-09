/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_03;

/**
 *
 * @author Admin
 */
public class Cuadrado extends Figuras{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    @Override
    public  void calcularArea(){
        double area = lado * lado;
        System.out.println("El area del cuadrado " + getColor() + " es: " + area + " Centimetros");
    }
    
    
    @Override
    public  void calcularPerimetro(){
        double perimetro = 4 * lado;
        System.out.println("El perimetro del cuadrado " + getColor() + " es: " + perimetro + " Centimetros");
    }
    
    
}
