/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_03;

/**
 *
 * @author Admin
 */
public abstract class Figuras {
    private String color;

    public Figuras() {
        color = "";
    }

    public Figuras(String color) {
        this.color = color;
    }
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract void calcularArea();
    public abstract void calcularPerimetro();

    
    
    
}
