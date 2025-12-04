/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej02;

/**
 *
 * @author Admin
 */
public abstract class Persona {
    // Atributo común
    protected String nombre;
    
    public Persona(){
        this.nombre = "";
    }

    
    

    // Constructor: esto es para inicializar el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: cada subclase debe implementarlo
    public abstract String saludar();
}
