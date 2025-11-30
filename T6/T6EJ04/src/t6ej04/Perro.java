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
    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    public String getSonido() {
        return "Ladrido";
    }

    public String getAlimentacion() {
        return "Carnívora";
    }

    public String getHabitat() {
        return "Doméstico";
    }

    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
}
