/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author Admin
 */
public class Gato extends Felino {
    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maulla: Miau!");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println(nombre + " se alimenta de ratones.");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println(nombre + " vive en habitat domestico.");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre cientifico: Felis silvestris catus");
    }
}
