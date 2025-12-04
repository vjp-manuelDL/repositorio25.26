/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author Admin
 */
// Perro hereda de Animal → debe implementar el método abstracto 'hacerRuido()'
public class Perro extends Canido {
    // Constructor: le paso los datos a la cadena de herencia (hasta Animal)
    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra: Guau!");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println(nombre + " es carnivoro.");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println(nombre + " vive en habitat domestico.");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre cientifico: Canis lupus familiaris");
    }
}
