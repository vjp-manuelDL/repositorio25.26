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
        //creo la especie gato dentro de su especie "felino"

    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String getSonido() {
        return "Maullido";
    }

    @Override
    public String getAlimentacion() {
        return "Ratones";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
}
