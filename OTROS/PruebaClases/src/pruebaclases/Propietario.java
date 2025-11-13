/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaclases;

/**
 *
 * @author alumno
 */
public class Propietario {
    //atributos
    private String nombre;
    private int edad;
    
    //constructores
    public Propietario(){
        this.nombre = "";
        this.edad = 0;
       
    }
    
    public Propietario(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
