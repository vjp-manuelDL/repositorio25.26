/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_04;

/**
 *
 * @author Admin
 */
public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected float peso;

    public Animal() {
    }

    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public abstract void mostrarSonido();

    public abstract void mostrarAlimentacion();

    public abstract void mostrarHabidad();

    public abstract void mostrarNombreCienti();



}
