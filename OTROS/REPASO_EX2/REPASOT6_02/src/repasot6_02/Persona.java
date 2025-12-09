/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_02;

/**
 *
 * @author Admin
 */
public abstract class Persona {
    private String nombre;
    
    public Persona(){
        nombre = "";
        
    }
    
    public Persona(String nom){
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomb) {
        this.nombre = nomb;
    }
    
    public abstract void saludar();
    
    
    
}
