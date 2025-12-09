/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_02;

/**
 *
 * @author Admin
 */
public class Profesor extends Persona{
    private String especialidad;
    
    
    public Profesor(){
        especialidad = "";
    }
    public Profesor(String nombre, String especi){
        super(nombre);
        especialidad = especi;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especi) {
        this.especialidad = especi;
    }
    
    @Override
     public  void saludar(){
         System.out.println("Hola soy: " + getNombre());
         System.out.println("Y doy clases de: " + getEspecialidad());
     }
    
}
