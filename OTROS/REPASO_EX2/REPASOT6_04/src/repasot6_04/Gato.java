/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_04;

/**
 *
 * @author Admin
 */
public class Gato extends Felino{

    public Gato(String nombre, int edad, float peso) {
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
    
    
    
     @Override
    public void mostrarAlimentacion() {
        System.out.println("La alimentacion es RATONES");
    }

    @Override

    public void mostrarHabidad() {
        System.out.println("Su habitat es domestico");

    }

    @Override

    public void mostrarNombreCienti() {
        System.out.println("Su nombreCientifico es: Felis silvestris catus");

    }

    @Override

    public void mostarGenero() {
        System.out.println("Su genero es FELINO");

    }
    
    @Override
     public  void mostrarSonido(){
         System.out.println("El sonido es: MAULLIDO");
     }

    public  void mostrarInfo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Peso: " + getPeso());
        
        
    }
    
    
}
