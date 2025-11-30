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

    public String getSonido() {
        return "Maullido";
    }

    public String getAlimentacion() {
        return "Ratones";
    }

    public String getHabitat() {
        return "Doméstico";
    }

    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
}
