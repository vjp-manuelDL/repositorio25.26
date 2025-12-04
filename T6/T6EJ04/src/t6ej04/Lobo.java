/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author Admin
 */
public class Lobo extends Canido {
    public Lobo(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " aulla: Auuu!");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println(nombre + " es carnivoro.");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println(nombre + " vive en el bosque.");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre cientifico: Canis lupus");
    }
}
