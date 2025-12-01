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
      //creo la especie lobo dentro de su especie "canido"
    public Lobo(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String getSonido() {
        return "Aullido";
    }

    @Override
    public String getAlimentacion() {
        return "Carnivora";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }
}
