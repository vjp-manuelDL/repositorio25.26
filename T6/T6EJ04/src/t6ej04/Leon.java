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
    public Leon(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    public String getSonido() {
        return "Rugido";
    }

    public String getAlimentacion() {
        return "Carnívora";
    }

    public String getHabitat() {
        return "Sabana";
    }

    public String getNombreCientifico() {
        return "Panthera leo";
    }
}
