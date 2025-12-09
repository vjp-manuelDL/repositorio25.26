/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_04;

/**
 *
 * @author Admin
 */
public class Leon extends Felino{

    public Leon(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }
    
    

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public  void mostrarInfo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Peso: " + getPeso());
        
        
    }
    
     @Override
    public void mostrarAlimentacion() {
        System.out.println("La alimentacion es CARNIVORA");
    }

    @Override

    public void mostrarHabidad() {
        System.out.println("Su habitat es SABANA");

    }

    @Override

    public void mostrarNombreCienti() {
        System.out.println("Su nombreCientifico es: PANTHERA LEO");

    }

    @Override

    public void mostarGenero() {
        System.out.println("Su genero es FELINO");

    }
    
    @Override
     public  void mostrarSonido(){
         System.out.println("El sonido es: RUGIDO");
     }

    
    
    
}
