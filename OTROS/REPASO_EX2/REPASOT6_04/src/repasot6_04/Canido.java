/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_04;

/**
 *
 * @author Admin
 */
public abstract class Canido extends Animal {

    public Canido(String nombre, int edad, float peso) {
        super(nombre, edad, peso); // Llama al constructor de Animal
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    @Override
    public abstract void mostrarSonido();

    @Override
    public void mostrarAlimentacion() {
        System.out.println("La alimentacion es Carnivora");
    }

    @Override
    public abstract void mostrarHabidad();

    @Override
    public abstract void mostrarNombreCienti();

    public abstract void mostarGenero();

}
