/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author Admin
 */
public class Leon extends Felino {
      //creo la especie leon dentro de su especie "felino"
    public Leon(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String getSonido() {
        return "Rugido";
    }

    @Override
    public String getAlimentacion() {
        return "Carnivora";
    }

    @Override
    public String getHabitat() {
        return "Sabana";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }
}
