/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej02;

/**
 *
 * @author Admin
 */
public class Profesor extends Persona {
    private String especialidad;

    // Esto es para crear un profesor con nombre y especialidad
    public Profesor(String nombre, String especialidad) {
        super(nombre); // esto llama al constructor de Persona
        this.especialidad = especialidad;
    }

    // Esto es para devolver el saludo del profesor
    public String saludar() {
        return "Hola, soy el profesor " + nombre + " y soy de la especialidad de " + especialidad + ".";
    }
}
