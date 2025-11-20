/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej15;

/**
 *
 * @author Admin
 */
public class T5EJ15 {

    // Definimos el metodo main en el cual creamos las instancias de "Empleado"
    // y las imprimimos a consola.
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Javi", 1830, new Direccion("Vijay Nagar", "Block B, Dugri Road", "Indore", 50));
        Empleado empleado2 = new Empleado("Manuel", 2890, new Direccion("Vijay Nagar", "Block B, Dugri Road", "Indore", 50));
        Empleado empleado3 = new Empleado("Alberto", 3040, new Direccion("Vijay Nagar", "Block B, Dugri Road", "Indore", 50));

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
    }
}
