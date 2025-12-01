/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author Admin
 */
public class Perro extends Canido {
      //creo la especie perro dentro de su especie "canido"
    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    
    @Override
    public String getAlimentacion() {
        return "Carnivora";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
}
