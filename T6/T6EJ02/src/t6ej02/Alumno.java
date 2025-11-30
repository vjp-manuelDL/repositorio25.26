/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej02;

/**
 *
 * @author Admin
 */
public class Alumno extends Persona {
    private String grupo;

    // Esto es para crear un alumno con nombre y grupo
    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }

    // Esto es para devolver el saludo del alumno
    public String saludar() {
        return "Hola, soy el alumno " + nombre + " y estoy en el grupo de " + grupo + ".";
    }
}
