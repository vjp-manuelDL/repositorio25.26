/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author Admin
 */
public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Métodos abstractos (sin cuerpo, obligan a las subclases a implementarlos)
    public abstract String getSonido();
    public abstract String getAlimentacion();
    public abstract String getHabitat();
    public abstract String getNombreCientifico();
}
