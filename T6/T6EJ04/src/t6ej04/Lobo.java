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

    public String getSonido() {
        return "Aullido";
    }

    public String getAlimentacion() {
        return "Carnívora";
    }

    public String getHabitat() {
        return "Bosque";
    }

    public String getNombreCientifico() {
        return "Canis lupus";
    }
}
