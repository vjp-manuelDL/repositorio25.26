/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_03;

/**
 *
 * @author Admin
 */
public class Circulo extends Figuras{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(int radio, String color) {
        super(color);
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(int rad) {
        this.radio = rad;
    }
    
    @Override
    public  void calcularArea(){
        double area = Math.PI * (getRadio() * radio);
        System.out.println("El area del circulo " + getColor() + " es: " + area + " Centimetros");
    }
    @Override
    public  void calcularPerimetro(){
        double perimetro = Math.PI * (getRadio() * 2);
        System.out.println("El perimetro del circulo " + getColor() + " es: " + perimetro + " Centimetros");
    }

    
    
    
    
    
    
}
