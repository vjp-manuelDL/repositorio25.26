/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej02;

/**
 *
 * @author Admin
 */
public class Test {

    // Esto es para probar los objetos sin polimorfismo
    public static void pruebaDirecta() {
        Profesor p = new Profesor("Raul", "Entornos");
        Alumno a = new Alumno("Manuel", "DAM 1");

        System.out.println(p.saludar());
        System.out.println(a.saludar());
    }

    // Esto es para probar con polimorfismo (variables de tipo Persona)
    public static void pruebaPolimorfismo() {
        Persona p = new Profesor("Puerto", "Bases de Datos");
        Persona a = new Alumno("Lucas", "DAM 1");

        System.out.println(p.saludar());
        System.out.println(a.saludar());
    }
}
