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
// atributos comunes y los métodos que TODOS los animales deben implementar.
    protected String nombre;
    protected int edad;
    protected double peso; // en kg

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Métodos abstractos: obligan a las subclases a definir su comportamiento
    public abstract void hacerSonido();
    public abstract void mostrarAlimentacion();
    public abstract void mostrarHabitat();
    public abstract void mostrarNombreCientifico();

    // Método concreto para mostrar info común (opcional, pero útil)
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años, Peso: " + peso + " kg");
    }
}


